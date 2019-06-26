package me.xueyao.optimize.service.impl;

import org.springframework.stereotype.Service;

/**
 * @author Simon.Xue
 * @date 2019/6/26 11:23
 */
@Service
public class ManServiceImpl implements CountService{
    int count = 0;

    @Override
    public int getGender() {
        return 1;
    }

    @Override
    public int count(int gender) {
        return count + 6;
    }
}
