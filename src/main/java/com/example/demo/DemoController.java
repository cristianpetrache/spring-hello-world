package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("demo")
public class DemoController {

    @Value("${demo.text:nothing set}")
    private String demo;

    @GetMapping
    public ResponseEntity<String> getDemo() {
        return new ResponseEntity<>(demo, HttpStatus.OK);
    }
}
