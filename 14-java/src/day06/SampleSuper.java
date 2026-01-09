package day06;

public class SampleSuper {
    private int dataSuper;

    public SampleSuper(int dataSuper){
        this.dataSuper = dataSuper;
        System.out.println(">>> SampleSuper#SampleSuper(int)");
    }
    public SampleSuper(){
        dataSuper = 0;
        System.out.println(">>> SampleSuper#SampleSuper()");
    }
    public void setDataSuper(int dataSuper){this.dataSuper = dataSuper;}
    public int getDataSuper(){return dataSuper;}

    public void printSub(){
        System.out.println("dataSub =" + dataSuper);
    }
}
