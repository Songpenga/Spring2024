package hello.core;

import hello.core.discount.DiscountPolicy;
import hello.core.discount.RateDiscountPolicy;

public class Note {
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
