package kr.hs.Study.Config;

import kr.hs.Study.Beans.TestBean1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"kr.hs.Study.Beans.TestBean1"})
public class BeanConfigClass {
    @Bean
    public TestBean1 method1(){
        TestBean1 obj1 = new TestBean1();
        return obj1;
    }
}
