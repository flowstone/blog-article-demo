package me.xueyao.optimize.service.impl;

import me.xueyao.optimize.service.CandidateEvent;
import me.xueyao.optimize.service.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Simon.Xue
 * @date 2019-06-25 22:44
 **/
@Service
public class CandidateServiceImpl implements CandidateService {
    @Autowired
    private ApplicationContext applicationContext;
    @Autowired
    private WomenServiceImpl womenService;
    @Autowired
    private ManServiceImpl manService;
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

    }

    @Override
    public int countCandidate(int gender) {
        CountService countService = countServiceMap.get(gender);
        return countService.count(gender);
    }

    Map<Integer, CountService> countServiceMap = new HashMap<>();
    public CandidateServiceImpl(List<CountService> countServices) {
        for (CountService countService : countServices) {
            countServiceMap.put(countService.getGender(), countService);
        }
    }


}
