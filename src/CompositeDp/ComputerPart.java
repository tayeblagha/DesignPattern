package CompositeDp;

import java.util.ArrayList;
import java.util.List;


    interface Component {
        void showPrice();
    }



    class Leaf implements  Component{
        int price ;
        String name;

        public Leaf( String name,int price) {
            this.price = price;
            this.name = name;
        }

        @Override
        public void showPrice() {
            System.out.println(name +": " + price);
        }
    }

    class Composite implements  Component{

        String name;
        List <Component> components= new ArrayList<Component>();

        public Composite(String name) {
            this.name = name;
        }

        public void addComponent(Component c){
            this.components.add(c);
        }

        @Override
        public void showPrice() {
            System.out.println(name +": " );
            for (Component c : this.components){
                c.showPrice();
            }

        }
    }


