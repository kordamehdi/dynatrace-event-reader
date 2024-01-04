package com.cvshealth.epa.dynatracereader.dynatraceeventreader.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ProblemController {

    @PostMapping("/dynatrace-webhook")
    public ResponseEntity<?> handleWebhookData(@RequestBody ProblemDto problemDto) {
        System.out.println("########calling dynatrace-webhook endpoint########");
        return new ResponseEntity<>("Success", HttpStatus.CREATED);
    }
}
