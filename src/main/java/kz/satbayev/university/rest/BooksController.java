package kz.satbayev.university.rest;


import kz.satbayev.university.model.Books;
import kz.satbayev.university.repository.BooksRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping(value = "/books")
public class BooksController {

    @Autowired
    private BooksRepository booksRepository;

    @GetMapping("/{direction_id}")
    public ResponseEntity<List<Books>> getFiles(@PathVariable Long direction_id) {
        List<Books> directions=booksRepository.findByDirectionId(direction_id);
        return ResponseEntity.ok(directions);
    }

}
