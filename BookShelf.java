import java.util.ArrayList;

class BookShelf extends ArrayList<String>{
    public  void addBook(String book){
        add(book);
    }
    public  String removeBook(){
        return remove(size()-1);
    }

    public static void main(String [] args){
        BookShelf b = new BookShelf();
        b.addBook("book1");
        b.addBook("book2");
        b.remove(0);

    }

}