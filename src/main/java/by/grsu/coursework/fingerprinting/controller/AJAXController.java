package by.grsu.coursework.fingerprinting.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AJAXController {

    @PostMapping("/saveFp")
    public String saveFingerprint(){
        return "";
    }
}
