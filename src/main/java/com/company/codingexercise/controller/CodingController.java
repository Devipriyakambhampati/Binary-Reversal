package com.company.codingexercise.controller;

import com.company.codingexercise.service.CodingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/coding")
public class CodingController {

    @Autowired
    CodingService codingService;

    @PostMapping("binary/{ipstring}")
    public String BinaryReversal(@PathVariable String ipstring) {
        String str = codingService.binaryReversal(ipstring);
        return str;
    }

}
