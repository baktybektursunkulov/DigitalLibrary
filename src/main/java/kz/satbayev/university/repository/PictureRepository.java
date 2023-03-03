package kz.satbayev.university.repository;

import kz.satbayev.university.model.Picture;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PictureRepository extends JpaRepository<Picture, Long> {
}
