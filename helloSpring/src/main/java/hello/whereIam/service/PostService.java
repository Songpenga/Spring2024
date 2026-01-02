package hello.whereIam.service;

import hello.whereIam.domain.Post;
import hello.whereIam.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class PostService {

    private final PostRepository postRepository;

    @Autowired
    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    /**
     * 게시글 작성
     */
    public Long createPost(String title, String content, String author) {
        Post post = new Post(title, content, author);
        Post savedPost = postRepository.save(post);
        return savedPost.getId();
    }

    /**
     * 게시글 수정
     */
    public void updatePost(Long id, String title, String content) {
        Post post = postRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("게시글을 찾을 수 없습니다. id: " + id));
        post.update(title, content);
    }

    /**
     * 게시글 삭제
     */
    public void deletePost(Long id) {
        Post post = postRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("게시글을 찾을 수 없습니다. id: " + id));
        postRepository.delete(post);
    }

    /**
     * 게시글 조회 (조회수 증가)
     */
    @Transactional(readOnly = true)
    public Post findPost(Long id) {
        Post post = postRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("게시글을 찾을 수 없습니다. id: " + id));
        post.increaseViewCount();
        return post;
    }

    /**
     * 게시글 조회 (조회수 증가 없음)
     */
    @Transactional(readOnly = true)
    public Optional<Post> findPostWithoutViewCount(Long id) {
        return postRepository.findById(id);
    }

    /**
     * 전체 게시글 조회 (최신순)
     */
    @Transactional(readOnly = true)
    public List<Post> findAllPosts() {
        return postRepository.findAllByOrderByCreatedAtDesc();
    }

    /**
     * 페이징 처리된 게시글 조회
     */
    @Transactional(readOnly = true)
    public Page<Post> findPostsWithPaging(Pageable pageable) {
        return postRepository.findAll(pageable);
    }

    /**
     * 페이징 처리된 게시글 검색
     */
    @Transactional(readOnly = true)
    public Page<Post> searchPostsWithPaging(String keyword, Pageable pageable) {
        if (keyword == null || keyword.trim().isEmpty()) {
            return postRepository.findAll(pageable);
        }
        // 검색 결과를 페이징하기 위해 커스텀 구현이 필요하지만,
        // 간단한 버전으로는 전체 검색 후 수동 페이징
        List<Post> allResults = postRepository.findByTitleOrContentContaining(keyword);
        int start = (int) pageable.getOffset();
        int end = Math.min((start + pageable.getPageSize()), allResults.size());
        List<Post> pagedResults = allResults.subList(Math.min(start, allResults.size()), end);
        
        return new org.springframework.data.domain.PageImpl<>(
            pagedResults, 
            pageable, 
            allResults.size()
        );
    }

    /**
     * 제목으로 검색
     */
    @Transactional(readOnly = true)
    public List<Post> searchByTitle(String keyword) {
        return postRepository.findByTitleContaining(keyword);
    }

    /**
     * 제목 또는 내용으로 검색
     */
    @Transactional(readOnly = true)
    public List<Post> searchByTitleOrContent(String keyword) {
        return postRepository.findByTitleOrContentContaining(keyword);
    }
}

