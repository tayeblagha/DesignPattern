package Adapter;

public class Demo {
    public static void main(String[] args){
        PenAdaptor pa = new PenAdaptor();
        Assignment aw = new Assignment();
        aw.setP(pa);
        aw.writeAssignment("Program ");
    }
}
