package com.csi.service.test;

import com.csi.service.ArithmeticApplication;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AritmeticApplicationTest {

    ArithmeticApplication application = new ArithmeticApplication();

    @Test
    public void addTest(){
        Assertions.assertEquals(10, application.add(9, 1));
    }

    @Test
    public void subTest(){
        Assertions.assertEquals(11, application.sub(9, 1));
    }

}
