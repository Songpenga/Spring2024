package hello.core;

import hello.core.discount.DiscountPolicy;
import hello.core.discount.RateDiscountPolicy;

public class Note {
    /*
    * 25.01.03 스프링 빈 조회 - 동일한 타입이 둘 이상
    * 타입으로 조회시 같은 타입의 스프링 빈이 들 이상이면 오류가 발생한다. 이떄는 빈 이름을 지정해야된다.
    * ac.getBeansOfType() 을 사용하면 해당 타입의 모든 빈을 조회할 수 있다.
    */
    
    /*
    * 25.01.02
    * AppConging의 등장으로 애플리케이션이 사용영역과 구성영역으로 분리되었다.
    * 사용영역 : OrderServiceImpl, DiscountPolicy, FixDiscountPolicy, RateDiscountPolicy
    * 구성영역 : Appconfig
    *
    * 스프링 빈 조회 : getBean
    * 조회 대상 스프링 빈이 없으면 예외 발생 => NoSuchBeanDefinitionExceptopm : no bean name 'xxxxxxx' available;
    */
}
