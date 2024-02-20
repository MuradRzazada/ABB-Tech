package org.abbtech.lesson8;


import java.util.*;

public class Library {

    List<Book> list = new ArrayList<>();

    public List<Book> getList() {
        return list;
    }

    public void addBook(Book book) {
        list.add(book);
    }

    public void removeBook(int bookId) {
        list.remove(bookId);
    }

    public List<Book> findByTitle(String title) {
        return list.stream().filter(book -> book.getTitle().equals(title)).toList();

    }

    public List<Book> findByAuthor(String author) {
        return list.stream().filter(book -> book.getAuthor().equals(author)).toList();
    }

    public List<Book> findByGenre(String genre) {
        return list.stream().filter(book -> Objects.equals(book.getGenre(), genre)).toList();
    }

    public List<Book> sortByTitle() {
        Collections.sort(list, Comparator.comparing(Book::getTitle));
        return list;
    }

    public List<Book> sortByAuthor() {
        Collections.sort(list, Comparator.comparing(Book::getAuthor));
        return list;
    }

    public List<Book> sortByPublicationYear() {
        Collections.sort(list, Comparator.comparing(Book::getPublicationYear));
        return list;
    }

    public int averagePublicationYear() {
        return (int) list.stream()
                .mapToInt(Book::getPublicationYear)
                .average()
                .orElse(2010.0);
    }

    public int countBooks() {
        return list.size();
    }

}
