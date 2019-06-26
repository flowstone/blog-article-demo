package me.xueyao.optimize.service;

/**
 * @author Simon.Xue
 * @date 2019-06-25 22:43
 **/
public interface CandidateService {
    /**
     * 保存候选人
     * @author
     */
    void saveCandidate();

    /**
     * 统计候选人
     * @param gender 性别
     * @return
     */
    int countCandidate(int gender);
}
