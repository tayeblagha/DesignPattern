package ObserverDp;

public class Subscriber {

    @Override
    public String toString() {
        return "Subscriber{" +
                "name='" + name + '\'' +
                '}';
    }

    private String name;
    private Channel channel;

    public Subscriber(String name) {
        this.name = name;

    }

    public void update(){
        System.out.println("Video Uploaded " +channel);
    }
    public void subscribeChannel(Channel ch){
        channel =ch;
    }


}
