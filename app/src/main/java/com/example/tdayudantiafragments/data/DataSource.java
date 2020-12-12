package com.example.tdayudantiafragments.data;

import com.example.tdayudantiafragments.data.Book;

import java.util.ArrayList;
import java.util.List;

public class DataSource {
    public DataSource(){

    }
    public List<Book> getBooks(){
        List<Book> books = new ArrayList<>();
        for(int i=0; i<20; i++){
            Book book = new Book();
            book.setAuthor("Author"+i);
            book.setName("Libro"+i);
            book.setYear("Año"+i);
            book.setImage("Portada"+i);
            books.add(book);
        }
        return books;
    }
    public List<Book> getAllBooks(){
        List<Book> books = new ArrayList<>();
        books.add(new Book("The Divine Comedy", "Dante Alighieri", "1307 d.c", "https://images.cdn2.buscalibre.com/fit-in/360x360/01/e0/01e04c600c7b7bfaf5a14c17a640e5af.jpg"));
        books.add(new Book("The Epic Of Gilgamesh","Unknown", "2100 a.c", "https://upload.wikimedia.org/wikipedia/commons/thumb/1/13/Tablet_V_of_the_Epic_of_Gilgamesh.jpg/220px-Tablet_V_of_the_Epic_of_Gilgamesh.jpg"));
        books.add(new Book("One Thousand and One Nights","Unknown","Edad Media", "https://images-na.ssl-images-amazon.com/images/I/51kg-1A%2B3kL._AC_UL600_SR390,600_.jpg"));
        books.add(new Book("Don Quijote De La Mancha","Miguel de Cervantes", "1605 d.c", "https://upload.wikimedia.org/wikipedia/commons/d/d9/Don_Quixote_and_Sancho_Panza_by_Jules_David.png"));
        books.add(new Book("Invisible Man","Ralph Ellison", "1897 d.c", "https://m.media-amazon.com/images/I/41urypNXYyL.jpg"));
        books.add(new Book("The Brothers Karamazov","Fyodor Dostoevsky", "1879 d.c","https://images-na.ssl-images-amazon.com/images/I/8117HB7WbvL.jpg"));
        books.add(new Book("The Old Man and the Sea","Ernest Hemingway", "1951 d.c","https://images-na.ssl-images-amazon.com/images/I/91oNxcEYXFL.jpg"));
        books.add(new Book("Pride and Prejudice", "Jane Austen", "1813 d.c", "https://images.cdn3.buscalibre.com/fit-in/360x360/46/6b/466b0b47e932561b186c56358acbe55e.jpg"));
        return books;
    }
}
