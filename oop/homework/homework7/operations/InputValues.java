package oop.homework.homework7.operations;

public abstract class InputValues {

    private String a;
    private String b;

    public Double getDoubleA() {
        return Double.parseDouble(this.a);
    }
    public String getStringA(){
        return this.a;
    }
    public Double getDoubleB() {
        return Double.parseDouble(this.b);
    }
    public String getStringB(){
        return this.b;
    }
    private void setA(String a){
        this.a = a;
    }
    private void setB(String b){
        this.b = b;
    }

//    public InputValues(){
//        setA("0");
//        setB("0");
//    }
//    public InputValues(String a){
//        setA(a);
//        setB("0");
//    }
    public InputValues(String a, String  b){
        setA(a);
        setB(b);
    }
}
