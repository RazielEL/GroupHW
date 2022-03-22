package GH2;

abstract class Marks {
        int a;
        int b;
        int c;
        int d;

    Marks (int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    double getPercentageA(){
        return (a + b + c) / 3;
    }
    double getPercentageB(){
        return (a + b + c + d) / 4;
    }
}
class A extends Marks {
    A(int a, int b, int c, int d) {
        super(a, b, c, d);
    }
    @Override
    double getPercentageA() {
        return super.getPercentageA();
    }
}
class B extends Marks {
    B(int a, int b, int c, int d) {
        super(a, b, c, d);
    }
    @Override
    double getPercentageB() {
        return super.getPercentageB();
    }
}
public class AverageMarks {
    public static void main (String[] args){

    Marks studentB = new B(45, 33, 70, 90);
    Marks studentA = new A(99,99,22,100);

    System.out.println("Average percentage of student A: " + studentA.getPercentageA());
    System.out.println("Average percentage of student B: " + studentA.getPercentageB());

    }
}
