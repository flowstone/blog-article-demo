package me.xueyao.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


/**
 * @Description:
 * @Author: Simon.Xue
 * @Date: 2019/2/13 16:19
 */
@Aspect
@Component
public class HelloAspect {

    @Pointcut(value = "@annotation(me.xueyao.aspect.Hello)")
    public void Hello() {

    }

    //@Before(value = "Hello() && @annotation(hello)")
    @Before(value = "me.xueyao.aspect.HelloAspect.Hello() && @annotation(hello)")
    public void beforeMethod(JoinPoint joinPoint, Hello hello) {
        String print = hello.print();
        int value = hello.value();
        System.out.println("方法运行之前输出内容>>>>");
        System.out.println("默认值value = " + value + "输出内容print = " + print);
    }

    @AfterReturning(value = "Hello() && @annotation(hello)")
    public void afterMethod(JoinPoint joinPoint, Hello hello) {
        int value = hello.value();
        String print = hello.print();

        System.out.println("方法运行之后输出内容>>>>");
        System.out.println("默认值value = " + value + "输出内容print = " + print);
    }

}
