package me.xueyao.optimize.service.impl;

import org.springframework.stereotype.Service;

/**
 * @author Simon.Xue
 * @date 2019/6/26 11:22
 */
@Service
public class WomenServiceImpl implements CountService{
    int count = 0;

    @Override
    public int getGender() {
        return 0;
    }

    @Override
    public int count(int gender) {
        return count + 1;
    }
}
