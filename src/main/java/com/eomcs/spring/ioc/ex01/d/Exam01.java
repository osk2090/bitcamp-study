//IoC 컨테이너에 보관된 객체를 확인하기
package com.eomcs.spring.ioc.ex01.d;

import com.eomcs.spring.ioc.ex01.SpringUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Exam01 {
    public static void main(String[] args) {
        ApplicationContext iocContainer = new AnnotationConfigApplicationContext(
                "com/eomcs/spring/ioc/ex01/d/application-context.xml"
        );
        SpringUtils.printBeanList(iocContainer);

        System.out.println("실행 완료!");
    }
}