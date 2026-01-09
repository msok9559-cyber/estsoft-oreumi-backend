package day06;

public class Sample {

        //필드
        private int data;

        //정적 변수
        private static int numInstances = 0;

        //정적 상수
        private static final int MAX = 255;

        // 메서드
        public Sample(int data) {
            this.data = Math.min(data, MAX);

            // 새로운 인스턴스가 생성될 때마다 정적 변수 numInstances를 증가
            numInstances++;
        }
        public Sample() { this(0); }

        public void setData(int data) {this.data = data;}
        public int getData() {return data;}

        public int getNumInstances() {return numInstances;}

        public void print(){
            System.out.println("Data: "+data);
        }



}
