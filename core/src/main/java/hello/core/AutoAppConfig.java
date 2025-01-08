package hello.core;

import hello.core.MemberInfo.MemoryMemberRepository;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION,
                                            classes = Configuration.class) //빈에 올리지 않을 타입 지정
)

public class AutoAppConfig {

    @Bean(name = "memoryMemberRepository")
    MemoryMemberRepository memberRepository(){
        return new MemoryMemberRepository();
    } // 이 경우 수동 빈 등록이 우선권을 가져간다.
}
