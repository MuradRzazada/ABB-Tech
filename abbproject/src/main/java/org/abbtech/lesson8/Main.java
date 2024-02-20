package org.abbtech.lesson8;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book("A Time to Kill", "John Grisham", "mystery", 2012));
        library.addBook(new Book("Vile Bodies", "Evelyn Waugh", "Fiction", 2019));
        library.addBook(new Book("Number the Stars ", "Lois Lowry", "Narrative", 2021));
        library.addBook(new Book("Noli Me Tangere ", "by Jose Rizal", "Fiction", 2003));
        library.addBook(new Book("Effective Java", "Joshua Bloch", "Romance", 2008));
        library.addBook(new Book("Clean Code", "Robert C. Martin", "Contemporary Fiction", 2008));
        library.addBook(new Book("Head First Java", "Kathy Sierra & Bert Bates", "Literary Fiction", 2003));

        System.out.println("List after adding:" + library.getList());

        library.removeBook(1);
        System.out.println("List after removing: " + library.getList());


       List<Book> titleList= library.findByTitle("Noli Me Tangere ");
        System.out.println("\nSearch for books by title: " + titleList);

        List<Book> authorList = library.findByAuthor("John Grisham");
        System.out.println("Search for books by author" + authorList);

        List<Book> genreList=library.findByGenre("Romance");
        System.out.println("Search for books by genre: " + genreList);


        library.sortByTitle();
        System.out.println("\nSorted by title: " + library.getList());
        library.sortByAuthor();
        System.out.println("Sorted by author: " + library.getList());
        library.sortByPublicationYear();
        System.out.println("Sorted by Publication year: " + library.getList());

        System.out.println("\nCalculate the average publication year: "+library.averagePublicationYear());

        System.out.println("Count the number of books: "+library.countBooks());
    }
}