package CompositeDp;

public class CompositeTest {
    public static void main( String[] args){
       Component  monitor = new Leaf("Monitor",2500);
       Component keyBoard = new Leaf("keyboard",500);
        Composite hardDrive = new Composite("Hard Drive");
       hardDrive.addComponent(monitor);
       hardDrive.addComponent(keyBoard);
       hardDrive.showPrice();


    }
}
