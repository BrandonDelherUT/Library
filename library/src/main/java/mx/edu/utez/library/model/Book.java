package mx.edu.utez.library.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Book {
    private @Id @GeneratedValue Long id;
    private String title;
    private String author;
    private String editorial;
    private String year;
    private String edition;

    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return this.author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public String getEditorial() {
        return this.editorial;
    }
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getYear() {
        return this.year;
    }
    public void setYear(String year) {
        this.year = year;
    }

    public String getEdition() {
        return this.edition;
    }
    public void setEdition(String edition) {
        this.edition = edition;
    }


}
/*
INSERT INTO `book` (`id`, `title`, `author`, `editorial`, `year`, `edition`) VALUES (1, 'El principito', 'Antoine de Saint-Exupéry', 'Emecé Editores', '1943', '1');
 */