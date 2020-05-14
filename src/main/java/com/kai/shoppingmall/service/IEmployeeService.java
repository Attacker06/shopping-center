package com.kai.shoppingmall.service;

import com.kai.shoppingmall.entity.Employee;
import com.kai.shoppingmall.response.BaseResponse;

public interface IEmployeeService {
    BaseResponse findAll();

    BaseResponse select(Integer id);

    BaseResponse insert(Employee employee);

    BaseResponse update(Employee employee);

    BaseResponse delete(Integer id);

    BaseResponse register(Employee employee);
}
