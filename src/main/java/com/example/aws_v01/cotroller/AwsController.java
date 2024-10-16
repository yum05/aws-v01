package com.example.aws_v01.cotroller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class AwsController {
    @GetMapping("/aws")
    public String hello(){
        return "안녕하세요";
    }

    @GetMapping("/aws/v1")
    public String awsReturn(@RequestParam(defaultValue = "1" ,name="num") Integer num) {
        if (num == 1) {
            log.info("/aws/v1 호출.info log ######################");
        }else if(num == -1){
            log.warn("/aws/v1 호출.Wain log ######################");
        } else if(num == 0){
            log.error("/aws/v1 호출.Error log ######################");
        }
        return "<h1> AWS-v01 Test</h1>";
    }
}
