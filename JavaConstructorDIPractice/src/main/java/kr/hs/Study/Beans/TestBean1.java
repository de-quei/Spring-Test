package kr.hs.Study.Beans;

public class TestBean1 {
    String name;
    int number;

    public TestBean1(String name, int number){
        this.name = name;
        this.number = number;
    }

    public void bean1_init(){
        System.out.println("이닛 메서드");
    }

    public void bean1_destroy(){
        System.out.println("디스트로이 메서드");
    }

    public void prData(){
        System.out.println(name + " " + number + "등~~~");
    }
}
