package kr.hs.Study.Beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("t1")
public class TestBean1 {
    @Autowired
    @Qualifier("d1")
    DataBean1 data1;

    @Autowired
    @Qualifier("d1")
    DataBean1 data2;

    public DataBean1 getData1(){
        return data1;
    }

    public DataBean1 getData2(){
        return data2;
    }
}
