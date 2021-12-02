package com.kodilla.patterns2.adapter.bookclasifier;
import com.kodilla.patterns2.adapter.bookclassifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {

    public Set<Book> createBooks(int amount){
        Set<Book> bookDatabase = new HashSet<>();
        for(int i = 0; i<amount; i++){
            bookDatabase.add(new Book("Author 1"+i+1, "Title 1"+i+1,2000, "1234"+i));
        }
        return bookDatabase;
    }

    @Test
    public void publicationYearMedianTest(){
        MedianAdapter medianAdapter = new MedianAdapter();

        double average = medianAdapter.publicationYearMedian(createBooks(10));

        System.out.println(average);
        Assertions.assertEquals(2000.0, average);
    }
}
