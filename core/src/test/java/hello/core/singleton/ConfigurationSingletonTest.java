package hello.core.singleton;

import hello.core.Appconfig;
import hello.core.MemberInfo.MemberService;
import hello.core.MemberInfo.MemberServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigurationSingletonTest {

    @Test
    void conigurationTest(){
        ApplicationContext app = new AnnotationConfigApplicationContext(Appconfig.class);

        MemberServiceImpl memberService = app.getBean("memberService", MemberServiceImpl.class);
    }
}
