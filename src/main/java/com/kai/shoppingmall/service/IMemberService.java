package com.kai.shoppingmall.service;

import com.kai.shoppingmall.entity.Member;
import com.kai.shoppingmall.response.BaseResponse;

public interface IMemberService {
    BaseResponse findAll();

    BaseResponse select(Integer id);

    BaseResponse insert(Member member);

    BaseResponse update(Member member);

    BaseResponse delete(Integer id);
}
