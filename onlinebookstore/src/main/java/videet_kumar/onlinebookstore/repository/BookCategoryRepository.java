package videet_kumar.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import videet_kumar.onlinebookstore.entity.BookCategory;

public interface BookCategoryRepository extends JpaRepository<BookCategory, Long>{

}
