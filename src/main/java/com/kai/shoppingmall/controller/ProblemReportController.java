package com.kai.shoppingmall.controller;

import com.kai.shoppingmall.response.BaseResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/problemReport")
public class ProblemReportController {

    @GetMapping("findAll")
     public BaseResponse findAll(){
        return new BaseResponse();
    }

}