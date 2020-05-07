package com.kai.shoppingmall.controller;

import com.kai.shoppingmall.response.BaseResponse;
import com.kai.shoppingmall.service.impl.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/member")
public class MemberController {

    @Autowired
    MemberService memberService;

    @GetMapping("findAll")
    public BaseResponse findAll(){
        return memberService.findAll();
    }
}
