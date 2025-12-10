package day09;

public class Gcd {
    private int gcd;

    public Gcd(int gcd) {this.gcd = gcd;}

    public Gcd(){this(0);};

    public void setGcd(int gcd) {this.gcd = gcd;}
    public int getGcd() {return gcd;}

    public int calcGcd(int a, int b){
        return (b == 0) ? (this.gcd = a) : calcGcd(b, a % b);

    }

}
