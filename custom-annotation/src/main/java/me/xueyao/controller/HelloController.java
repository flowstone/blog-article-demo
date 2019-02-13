package me.xueyao.controller;

import me.xueyao.aspect.Hello;
import me.xueyao.common.BaseResponse;
import me.xueyao.common.ResponseStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: Simon.Xue
 * @Date: 2019/2/13 16:33
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @GetMapping("/world")
    @Hello(value = 1, print = "好想睡觉")
    public BaseResponse world() {
        logger.info("此方法使用了自定义注解");
        return new BaseResponse(ResponseStatus.SUCCESS);
    }
}
