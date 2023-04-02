package ru.nazarfatichov.tafifod.api;

import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/")
@Slf4j
public class MainController {

    private final AtomicInteger counter = new AtomicInteger(0);

    @GetMapping
    public ResponseEntity<String> get() {

        return ResponseEntity.ok(Integer.toString(counter.get()));
    }

    @GetMapping("stat")
    public ResponseEntity<String> getAndIncrement() {

        return ResponseEntity.ok(Integer.toString(counter.getAndIncrement()));
    }

    @GetMapping("about")
    public ResponseEntity<String> getAbout() {

        String about = "<h3> Hello , Nazar Fatikhov</h3>.";
        return ResponseEntity.ok(about);
    }
}
