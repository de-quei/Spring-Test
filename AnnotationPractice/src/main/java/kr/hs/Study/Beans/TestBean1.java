package kr.hs.Study.Beans;

import org.springframework.stereotype.Component;

@Component("t1")
public class TestBean1 {
    public TestBean1() {
        System.out.println("TestBean1의 생성자");
    }
}
