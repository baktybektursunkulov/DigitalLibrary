package kz.satbayev.university.repository;

import kz.satbayev.university.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String name);

    User findByEmail(String email);

    @Query(nativeQuery = true,value = "UPDATE table_name SET password = ?2 WHERE id=?1")
    void updatePassword(Long id, String password);
}
