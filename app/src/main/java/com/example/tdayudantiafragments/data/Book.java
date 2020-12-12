package com.example.tdayudantiafragments.data;

public class Book {
    private String name, author, year, image;


    public Book(String name, String author, String year, String image) {
        this.name = name;
        this.author = author;
        this.year = year;
        this.image = image;
    }
    public Book(){

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", year='" + year + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}
