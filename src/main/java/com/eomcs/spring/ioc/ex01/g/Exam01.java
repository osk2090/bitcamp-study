package com.eomcs.spring.ioc.ex01.g;

import com.eomcs.spring.ioc.SpringUtils;
import com.eomcs.spring.ioc.ex01.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam01 {
    public static void main(String[] args) {
        ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
                "com/eomcs/spring/ioc/ex01/g/application-context.xml"
        );

        //현재 IoC 컨테이너에 들어 있는 객체를 출력
        SpringUtils.printBeanList(iocContainer);

        //객체 이름으로 꺼내기
        System.out.println(iocContainer.getBean("c1"));

        //객체 타입으로 꺼내기
        System.out.println(iocContainer.getBean(Car.class));
        
        System.out.println("실행 완료!");

    }
}