package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.stream.IntStream;

public class LibraryTestSuite {

    @Test
    void testGetBooks(){
        Library library = new Library("Library 1");
        IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> library.getBooks().add(new Book("Book " + n, "Author "+n, LocalDate.of(2000+n,n+1,n+10))));

        Library shallowCloneLibrary = null;
        try {
            shallowCloneLibrary = library.shallowCopy();
            shallowCloneLibrary.setName("Library 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Library 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        System.out.println(library);
        System.out.println(shallowCloneLibrary);

        library.getBooks().remove(library.getBooks().size()-1);

        System.out.println(library);
        System.out.println(shallowCloneLibrary);
        System.out.println(deepClonedLibrary);

        Assertions.assertEquals(10, library.getBooks().size());
        Assertions.assertEquals(10, shallowCloneLibrary.getBooks().size());
        Assertions.assertEquals(10, deepClonedLibrary.getBooks().size());
    }
}
