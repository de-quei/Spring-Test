package kr.hs.Study.Beans;

import org.springframework.stereotype.Component;

@Component("d1")
public class DataBean1 {
    public DataBean1(){
        System.out.println("DataBean1의 생성자");
    }
}
