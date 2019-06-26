package me.xueyao.optimize.service.impl;

/**
 * @author Simon.Xue
 * @date 2019/6/26 11:27
 */
public interface CountService {
    int getGender();
    /**
     * 计算总和
     * @param gender
     * @return
     */
    int count(int gender);
}
