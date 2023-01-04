package com.example.uxplaylist.Controller;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins ="*")
@RestController
@RequiredArgsConstructor
public class TestController {

    @GetMapping(value="/")
    @CrossOrigin(origins = "http//localhost:3000")
    public String test(){

        return "연동테스트";
    }
}
