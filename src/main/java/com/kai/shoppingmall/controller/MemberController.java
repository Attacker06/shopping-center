package com.kai.shoppingmall.controller;

import com.kai.shoppingmall.entity.Member;
import com.kai.shoppingmall.response.BaseResponse;
import com.kai.shoppingmall.service.impl.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/member")
public class MemberController {

    @Autowired
    MemberService memberService;

    @GetMapping("/findAll")
    public BaseResponse findAll(){
        return memberService.findAll();
    }

    @PostMapping("/insert")
    public BaseResponse insert(@RequestBody Member member){
        return memberService.insert(member);
    }

    @GetMapping("/select")
    public BaseResponse select(@RequestParam Integer id){
        return memberService.select(id);
    }

    @PutMapping("/update")
    public BaseResponse update(@RequestBody Member member){
        return memberService.update(member);
    }

    @DeleteMapping("/delete")
    public BaseResponse delete(@RequestParam Integer id){
        return memberService.delete(id);
    }
}
