package hello.core;

import hello.core.discount.DiscountPolicy;
import hello.core.discount.RateDiscountPolicy;

public class Note {
    /*
    * 25.01.06
    *
    * 싱글톤 컨테이너
    *   스프링 컨테이너는 싱글턴 패턴을 적용하지 않아도, 객체 인스턴스르 싱글톤으로 관리한다.
        스프링 컨테이너는 싱글톤 컨테이너 역할을 한다. 이렇게 싱그론 객체를 생성하고 관리하는 기능을 싱글톤 레지스트리라 한다.
        * 스프링 컨테이너의 이런 기능 덕분에 싱글턴 패턴의 모든 단점을 해결하면서 객체를 싱글톤으로 유지할 수 있다.
        * DIP, OCP, 테스트, private 생성자로부터 자유롭게 싱글톤을 사용할 수 있다.
    * 싱글톤 패턴
    *   이미 만들어진 객체를 공유해서 효율적으로 사용할 수 있다.
    *
    * 싱글톤 패턴 문제점
    *   싱글톤 패턴을 구현하는 코드 자체가 많이 들어간다.
    * 의존관계상 클라이언트가 구체 클레스에 의존한다. -> dip를 위반한다
    * 클라이언트가 구체 클레스에 의존해서 ocp원칙을 위반할 가능성이 높다.
    * 테스트하기 어렵다.
    * 내부 속성을 변경하거나 초기화 하기 어렵다.
    * private 생성자로 자식 클래스를 만들기 어렵다.
    * 유연성이 떨어진다
    * 안티 패턴으로 불리기도 한다.
    */
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
