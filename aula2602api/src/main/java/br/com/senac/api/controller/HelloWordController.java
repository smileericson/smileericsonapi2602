package br.com.senac.api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/helloworld")

public class HelloWordController {
    @GetMapping("/teste")

    public ResponseEntity<String> teste() {
        return ResponseEntity.ok("Ola mundo!");
    }


}
