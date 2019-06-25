package me.xueyao.optimize.service;

import org.springframework.context.ApplicationEvent;

/**
 * 候选人事件
 * @author Simon.Xue
 * @date 2019-06-25 22:50
 **/
public class CandidateEvent extends ApplicationEvent {
    public CandidateEvent(Object source) {
        super(source);
    }
}
