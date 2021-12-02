package com.kodilla.patterns2.adapter.bookclassifier;
import com.kodilla.patterns2.adapter.bookclassifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclassifier.libraryb.Book;
import com.kodilla.patterns2.adapter.bookclassifier.libraryb.BookSignature;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {
    @Override
    public int publicationYearMedian(Set<com.kodilla.patterns2.adapter.bookclassifier.librarya.Book> bookSet) {
        Map<BookSignature, Book> booksMap = new HashMap<>();
        for(com.kodilla.patterns2.adapter.bookclassifier.librarya.Book map : bookSet){
            booksMap.put(new BookSignature(map.getSignature()), new Book(map.getAuthor(), map.getTitle(), map.getPublicationYear()));
        }
        return medianPublicationYear(booksMap);
    }
}
