package me.xueyao.optimize;

import me.xueyao.optimize.service.CandidateService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OptimizeApplicationTests {

    @Autowired
    private CandidateService candidateService;

    @Test
    public void saveCandidate() {
        candidateService.saveCandidate();
    }

}
