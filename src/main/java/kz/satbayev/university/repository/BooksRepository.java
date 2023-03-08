package kz.satbayev.university.repository;

import kz.satbayev.university.model.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface BooksRepository extends JpaRepository<Books, Long> {


    @Query(nativeQuery = true,value = "select * from Books b where b.direction = ?1")
    List<Books> findByDirectionId(Long direction_id);
}
