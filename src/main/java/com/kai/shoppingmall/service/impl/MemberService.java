package com.kai.shoppingmall.service.impl;

import com.kai.shoppingmall.entity.Member;
import com.kai.shoppingmall.repository.MemberRepository;
import com.kai.shoppingmall.response.BaseResponse;
import com.kai.shoppingmall.service.IMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService implements IMemberService {

    @Autowired
    MemberRepository memberRepository;

    @Override
    public BaseResponse findAll() {
        BaseResponse baseResponse = new BaseResponse();
        List<Member> memberList = memberRepository.findAll();
        baseResponse.setStatus(true);
        baseResponse.setMessage("查詢成功");
        baseResponse.setData(memberList);
        return baseResponse;
    }
}
