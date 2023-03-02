package kz.satbayev.university.rest;


import kz.satbayev.university.model.Direction;
import kz.satbayev.university.repository.DirectionRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping(value = "/direction")
public class DirectionController {

    @Autowired
    private DirectionRepository directionRepository;

    @GetMapping()
    public ResponseEntity<List<Direction>> getFiles() {
        List<Direction> directions=directionRepository.findAll();
        return ResponseEntity.ok(directions);
    }

}
