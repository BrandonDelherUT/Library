package mx.edu.utez.library.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import mx.edu.utez.library.model.Book;
import mx.edu.utez.library.repository.BookRepository;
import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    @Autowired
    private BookRepository repo;

    public List<Book> listAllBooks() {
        return repo.findAll();
    }

    public Optional<Book> getByIdBook(Long id) {
        return repo.findById(id);
    }

    public void saveBook(Book book) {
        repo.save(book);
    }

    public void deleteBook(Long id) {
        repo.deleteById(id);
    }

}
