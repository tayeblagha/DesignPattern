package PrototypeDp;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable {
    private String ShopName;
    List<Book> books = new ArrayList<>();

    public String getShopName() {
        return ShopName;
    }

    public List<Book> getBooks() {
        return books;
    }

    @Override
    public String toString() {
        return "BookShop{" +
                "ShopName='" + ShopName + '\'' +
                ", books=" + books +
                '}';
    }
    public void loadData(){
    for (int i=1;i<10;i++){
        Book b = new Book();
        b.setBid(i);
        b.setBname("book"+i);
        getBooks().add(b);
    }
    }

    public void setShopName(String shopName) {
        ShopName = shopName;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
// shallow copying
//    @Override
//    public BookShop clone() {
//        try {
//            BookShop clone = (BookShop) super.clone();
//            // TODO: copy mutable state here, so the clone can't change the internals of the original
//            return clone;
//        } catch (CloneNotSupportedException e) {
//            throw new AssertionError();
//        }
//    }

// Deep Copying

    public BookShop clone() {

            BookShop b = new BookShop();
            for(Book book:this.getBooks()){
                b.getBooks().add(book);}
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return b;

    }


}
