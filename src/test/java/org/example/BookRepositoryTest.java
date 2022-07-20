package org.example;

import org.example.entity.BookEntity;
import org.junit.Test;

import java.util.List;

public class BookRepositoryTest {

    @Test
    public void test() throws Exception {

        BookRepository bookRepository = new BookRepository();

        List<BookEntity> bookEntityList = bookRepository.selectList(new BookEntity());

        System.out.println(bookEntityList.size());
    }

}