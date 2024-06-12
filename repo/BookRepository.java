package in.praveenit.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.praveenit.entity.Book;

public interface BookRepository extends JpaRepository<Book, Serializable>{

}

