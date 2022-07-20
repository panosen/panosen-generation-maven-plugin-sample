package org.example;

import java.io.IOException;

import com.panosen.orm.DalTableDao;
import org.springframework.stereotype.Component;

import org.example.entity.BookEntity;

@Component
public class BookRepository extends DalTableDao<BookEntity> {

    public BookRepository() throws IOException {
        super(BookEntity.class);
    }
}
