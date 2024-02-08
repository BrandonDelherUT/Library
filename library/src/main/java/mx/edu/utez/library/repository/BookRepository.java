package mx.edu.utez.library.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import mx.edu.utez.library.model.Book;


public interface BookRepository extends JpaRepository<Book, Long> {
}
