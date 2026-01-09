package day05;

public class Sample {
    // 필드(fields) 또는 인스턴스 변수(instance variables)
    private int data;

    public void setData(int n){
        if (n >=0)
            data = n;
    }

    public int getData(){
        return data;
    }

    void print(){
        System.out.println("data = " + data);
    }
}
