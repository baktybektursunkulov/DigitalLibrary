package kz.satbayev.university.rest;


import kz.satbayev.university.model.Picture;
import kz.satbayev.university.repository.PictureRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping(value = "/picture")
public class PictureController {

    @Autowired
    private PictureRepository pictureRepository;

    @GetMapping()
    public ResponseEntity<List<Picture>> getFiles() {
        List<Picture> pictures=pictureRepository.findAll();
        return ResponseEntity.ok(pictures);
    }

}
