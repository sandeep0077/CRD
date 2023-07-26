package com.i3Verticals.CRD.DEMO.Controller;


import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("books")
public class fileProcessController {

    @GetMapping("/processable")
    public void fileProcess(@RequestBody fileToProcess){
        // get the file
        // convert TSV to Json in service
    }

}
