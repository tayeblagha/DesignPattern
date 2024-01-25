package FactoryDp;




public class Factory {
    public static void main(String[] args) {
        FactoryOperation osf = new FactoryOperation();
        OS obj = osf.getInstance("open");
        obj.spec();
//        OS obj= new Android();
//        obj.spec();


    }
}