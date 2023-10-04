package com.ecole221.depoyk8sapi;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DepoyK8sApiApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void sample(){
        Assertions.assertEquals(1, 1);
    }

}
