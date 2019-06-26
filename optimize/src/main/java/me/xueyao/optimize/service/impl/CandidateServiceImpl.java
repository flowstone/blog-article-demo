package me.xueyao.optimize.service.impl;

import me.xueyao.optimize.service.CandidateEvent;
import me.xueyao.optimize.service.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Service;

/**
 * @author Simon.Xue
 * @date 2019-06-25 22:44
 **/
@Service
public class CandidateServiceImpl implements CandidateService {
    @Autowired
    private ApplicationContext applicationContext;
    @Override
    public void saveCandidate() {
        /**
         * 不满足单一原则
         */
        //1.创建候选人
        System.out.println("创建候选人");

        //2.发送短信
        //System.out.println("发送短信");
        applicationContext.publishEvent(new CandidateEvent(applicationContext));


        //3.发送邮件
        //System.out.println("发送邮件");
        //applicationContext.publishEvent(new CandidateEvent(applicationContext));

    }
}
