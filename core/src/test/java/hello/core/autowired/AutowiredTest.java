package hello.core.autowired;

import hello.core.Member;
import jakarta.annotation.Nullable;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class AutowiredTest {

    //호출안됨
    @Autowired(required = false)
    public void setNoBean1(@Nullable Member member){
        System.out.println("setNoBean1 = " + member);
    }

    //null 호출
    @Autowired(required = false)
    public void setNoBean2(@Nullable Member member){
        System.out.println("setNoBean2 = " + member);
    }

    //Option.empt
    @Autowired(required = false)
    public void setNoBean3(Optional<Member> member){
        System.out.println("setNoBean3 = " + member);
    }

    @Test
    void AutowiredOption(){


    }
}

