package in.venkataravi.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.venkataravi.onlinebookstore.entity.Book;

public interface BookRepository extends JpaRepository<Book,Long>{

}
