package me.xueyao.aspect;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Hello {
    int value() default 0;
    String print() default "Hello World";
}
