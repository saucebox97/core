package com.spring.core.chap03.config;

import com.spring.core.chap03.Hotel;
import com.spring.core.chap03.computer.Computer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComputerAutoConfigTest {
    // Computer 에도 Component 를 붙여야한다
    @Test
    @DisplayName("Component 에너테이션이 붙은 빈들이 등록되어야 한다.")
    void autoConfigTest() {
        AnnotationConfigApplicationContext ac
                = new AnnotationConfigApplicationContext(ComputerAutoConfig.class);
        Computer computer = ac.getBean(Computer.class);
        computer.showSpec();
    }

}
