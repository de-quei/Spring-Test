package kr.hs.Study.Beans;

public class TestBean1 {
    int data1;
    String data2;

    public int getData1() {
        return data1;
    }

    public void setData1(int data1) {
        this.data1 = data1;
    }

    public String getData2() {
        return data2;
    }

    public void setData2(String data2) {
        this.data2 = data2;
    }


    public void prData() {
        System.out.println("data1 : " + data1);
        System.out.println("data2 : " + data2);
    }
}
