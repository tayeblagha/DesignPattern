package ObserverDp;

import java.util.ArrayList;
import java.util.List;

public class Channel {
    @Override
    public String toString() {
        return "Channel{" +
                "title='" + title + '\'' +
                '}';
    }

    public Channel(String title) {
        this.title = title;
    }

    List<Subscriber> subs = new ArrayList<>();
    public String title;

    public void subscribe(Subscriber sub){
        subs.add(sub);
    }

    public void unsubscribe(Subscriber sub){
        subs.remove(sub);
    }
    public void notifySubscriber(){
        for(Subscriber sub: subs){
            sub.update();
        }
    }
    public void upload(String title){
        this.title=title;
        notifySubscriber();
    }


}
