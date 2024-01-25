package PrototypeDp;

public class Demo {
    public static void main (String[] args){
BookShop bs = new BookShop();
bs.setShopName("Novelty");
bs.loadData();

BookShop bs2=bs.clone();
System.out.println(bs2);
    }

}
