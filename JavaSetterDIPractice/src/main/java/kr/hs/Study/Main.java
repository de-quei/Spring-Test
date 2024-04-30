package kr.hs.Study;

import kr.hs.Study.Beans.TestBean1;
import kr.hs.Study.Config.BeanConfigClass;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);

        TestBean1 obj1 = ctx.getBean("method1", TestBean1.class);

        System.out.println("===========");
        System.out.println(obj1.getData1());
        System.out.println(obj1.getData2());

        ctx.close();
    }
}