package me.xueyao.optimize.service.impl;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author Simon.Xue
 * @date 2019-06-25 22:52
 **/
@Component
public class SendSmsListener implements ApplicationListener {
    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        System.out.println("发送短信");
    }
}
