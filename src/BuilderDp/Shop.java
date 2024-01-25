package BuilderDp;

public class Shop {

    public static void main(String[]args){
      phone samsung = new PhoneBuilder().setOs("Android").setRam(4).getPhone();
      System.out.println(samsung);
    }
}
