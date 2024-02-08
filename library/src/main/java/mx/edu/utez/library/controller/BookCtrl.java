package mx.edu.utez.library.controller;

import mx.edu.utez.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import mx.edu.utez.library.model.Book;

import java.util.List;

@RestController
@RequestMapping("/api/books")
@CrossOrigin(origins = "http://localhost:5174")
public class BookCtrl {

    @Autowired
    BookService service;

    @GetMapping
    public List<Book> getALlBooks() {
        return service.listAllBooks();
    }

    @GetMapping("/{id}")
    public Book getByIdBook(@PathVariable Long id) {
        return service.getByIdBook(id).orElse(null);
    }

    @PostMapping("/add")
    public void addBook(@RequestBody Book book) {
        service.saveBook(book);
    }


}
