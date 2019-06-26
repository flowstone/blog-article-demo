package me.xueyao.optimize.service.impl;

import me.xueyao.optimize.service.CandidateEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author Simon.Xue
 * @date 2019-06-25 22:55
 **/
@Component
public class SendEmailListener implements ApplicationListener<CandidateEvent> {

    @Override
    public void onApplicationEvent(CandidateEvent candidateEvent) {
        System.out.println("发送邮件");
    }
}
