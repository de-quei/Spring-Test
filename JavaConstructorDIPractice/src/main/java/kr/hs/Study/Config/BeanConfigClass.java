package kr.hs.Study.Config;


import kr.hs.Study.Beans.TestBean1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"kr.hs.Study.Beans"})
public class BeanConfigClass {

    @Bean(initMethod="bean1_init", destroyMethod="bean1_destroy")
    public TestBean1 java1(){
        TestBean1 obj1 = new TestBean1("홍효빈", 1);
        return obj1;
    }
}
