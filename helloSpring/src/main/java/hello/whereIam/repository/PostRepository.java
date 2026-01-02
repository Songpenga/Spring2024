package hello.whereIam.repository;

import hello.whereIam.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

    // 제목으로 검색
    List<Post> findByTitleContaining(String keyword);

    // 작성자로 검색
    List<Post> findByAuthorContaining(String keyword);

    // 제목 또는 내용으로 검색
    @Query("SELECT p FROM Post p WHERE p.title LIKE %:keyword% OR p.content LIKE %:keyword%")
    List<Post> findByTitleOrContentContaining(@Param("keyword") String keyword);

    // 작성일 내림차순 정렬
    List<Post> findAllByOrderByCreatedAtDesc();
}


