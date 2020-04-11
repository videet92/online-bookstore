package videet_kumar.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import videet_kumar.onlinebookstore.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

}
