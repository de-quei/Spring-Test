package org.example.Beans;

public class TestBean1 {
    int data1;
    String data2;

    public TestBean1(int data1, String data2){
        this.data1 = data1;
        this.data2 = data2;
    }

    public void prData(){
        System.out.println("data1 : " + data1);
        System.out.println("data2 : " + data2);
    }
}
