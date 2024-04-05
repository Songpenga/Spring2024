package hello.helloSpring.repository;

import hello.helloSpring.domain.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

// case test후에는 clear를 해줘야 한다.
class MemoryMemberRepositoryTest {
    MemoryMemberRepository Repository = new MemoryMemberRepository();

    @AfterEach // 어떤 메소드가 동작이 끝날때마다 실행이 된다. ==> callback Method
    public void afterEach(){
        Repository.clearStore();
    }
    @Test
    public void save(){
        Member member = new Member();
        member.setName("Peng"); // 저장

        Repository.save(member);

        Member result = Repository.findById(member.getId()).get();// optional을 꺼낼떄는 get()을 사용
       //1.
        //System.out.println("result: " + (result == member)); // => true

        //2.
        //Assertions.assertEquals(result, member);

        //3.
        //Assertions.assertThat(member).isEqualTo(result);

        //4.
        assertThat(member).isEqualTo(result);
    }

    @Test
    public void findByName(){
        Member member1 = new Member();
        member1.setName("spring1");
        Repository.save(member1);

        Member member2 = new Member();
        member2.setName("spring2");
        Repository.save(member2);

        Member result = Repository.findByName("spring1").get();

        assertThat(result).isEqualTo(member1);
    }

    @Test
    public void findAll(){
/*        Member member1 = new Member();
        member1.setName("spring1");
        Repository.save(member1);

        Member member2 = new Member();
        member2.setName("spring1");
        Repository.save(member2);

        List<Member> result = Repository.findAll();
        assertThat(result.size()).isEqualTo(2);*/

    }

}
