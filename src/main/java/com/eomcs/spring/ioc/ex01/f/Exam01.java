package com.eomcs.spring.ioc.ex01.f;

import com.eomcs.spring.ioc.SpringUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam01 {
    public static void main(String[] args) {
        ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
                "com/eomcs/spring/ioc/ex01/f/application-context.xml"
        );

        SpringUtils.printBeanList(iocContainer);

        System.out.println("실행 완료!");

    }
}