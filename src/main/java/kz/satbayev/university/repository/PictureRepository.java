package kz.satbayev.university.repository;

import kz.satbayev.university.model.Books;
import kz.satbayev.university.model.Picture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface PictureRepository extends JpaRepository<Picture, Long> {

    @Query(nativeQuery = true,value = "select * from Picture b where b.books_id = ?1")
    Picture findByBookId(Long book_id);
}
