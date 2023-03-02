package kz.satbayev.university.repository;

import kz.satbayev.university.model.Books;
import kz.satbayev.university.model.Direction;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DirectionRepository extends JpaRepository<Direction, Long> {
}
