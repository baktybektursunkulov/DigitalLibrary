package kz.satbayev.university.service;

import kz.satbayev.university.model.User;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface UserService {

    User register(User user);

    List<User> getAll();

    User findByUsername(String username);

    User findByEmail(String email);


    User findById(Long id);

    void delete(Long id);

    void updatePassword(Long user, String password);
}
