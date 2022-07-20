package org.example.entity;

import java.sql.Timestamp;
import java.sql.Types;

import com.panosen.orm.annonation.*;

@Entity
@DataSource(name = "library")
@Table(name = "book")
public class BookEntity {

    @Id
    @Column(name = "id")
    @Type(type = Types.INTEGER)
    private Integer id;

    @Column(name = "name")
    @Type(type = Types.VARCHAR)
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
