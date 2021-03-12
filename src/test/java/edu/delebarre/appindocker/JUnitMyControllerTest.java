package edu.delebarre.appindocker;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class JUnitMyControllerTest {
    @Autowired
    MyController myController;

    @Test
    public void checkHiMessage() throws Exception{
        String result = myController.sayHello();
        assertThat(result).isEqualTo("Hello!");
    }

}
