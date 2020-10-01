public class typeOfInteger {
    protected float x = 2.3;
    protected float y = 10.2;

    public typeOfInteger() {
    }
    void method1() {

        this.x = 3.3; //initialization
    }
    void method2() {
        if(x>y){
            System.out.println("Min is y");
        }
        else
            System.out.println("Min is x");

    }

}