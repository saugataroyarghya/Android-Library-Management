package Assignment;

public class B1 {
    String a, b;
    float number;

    public B1(String a, String b, float number, double conflicting_number) {
        this.a = a;
        this.b = b;
        this.number = number;
        this.conflicting_number = conflicting_number;
    }

    double conflicting_number;

    public double getConflicting_number() {
        return conflicting_number;
    }

    public void setConflicting_number(double conflicting_number) {
        this.conflicting_number = conflicting_number;
    }
    

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public float getNumber() {
        return number;
    }

    public void setNumber(float number) {
        this.number = number;
    }
}
