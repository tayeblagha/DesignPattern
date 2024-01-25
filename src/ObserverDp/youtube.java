package ObserverDp;

public class youtube {
    public static void main (String[]  args) {
        Channel tel = new Channel("tel");

        Subscriber s1 = new Subscriber("s1");
        s1.subscribeChannel(tel);
        tel.subscribe(s1);

        tel.upload("Programming Tutorial");

    }

}
