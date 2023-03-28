package kz.satbayev.university.repository;

import kz.satbayev.university.model.Books;
import kz.satbayev.university.model.Password_Reset_Token;
import kz.satbayev.university.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;

public interface Password_Reset_TokenRepository extends JpaRepository<Password_Reset_Token, Long> {
    Password_Reset_Token findByToken(String token);
    @Query(nativeQuery = true,value = "select b.id, b.token, b.user, b.expiry_date from password_reset_token b where b.user = cast(?1 AS bigint)")
    Password_Reset_Token findByUserId(Long user_id);
    @Transactional
    @Modifying(clearAutomatically = true)
    @Query(nativeQuery = true,value = "insert into password_reset_token(token,\"user\",\"expiry_date\") values (?2,cast(?1 AS bigint),?3)")
    void saveToken(Long user, String token, Timestamp timestamp);
}