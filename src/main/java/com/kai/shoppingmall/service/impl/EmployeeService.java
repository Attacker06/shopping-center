package com.kai.shoppingmall.service.impl;

import com.kai.shoppingmall.entity.Employee;
import com.kai.shoppingmall.repository.EmployeeRepository;
import com.kai.shoppingmall.response.BaseResponse;
import com.kai.shoppingmall.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService implements IEmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public BaseResponse findAll() {
        BaseResponse baseResponse = new BaseResponse();
        try {
            List<Employee> employeeList = employeeRepository.findAll();
            baseResponse.setStatus(true);
            baseResponse.setMessage("查詢成功");
            baseResponse.setData(employeeList);
        }catch (Exception e){
            baseResponse.setStatus(false);
            baseResponse.setMessage("查詢失敗");
        }
        return baseResponse;
    }

    @Override
    public BaseResponse select(Integer id) {
        BaseResponse baseResponse = new BaseResponse();
        try {
            Employee employee = employeeRepository.getOne(id);
            baseResponse.setStatus(true);
            baseResponse.setMessage("查詢成功");
            baseResponse.setData(employee);
        }catch (Exception e){
            baseResponse.setStatus(false);
            baseResponse.setMessage("查詢失敗");
        }
        return baseResponse;
    }

    @Override
    public BaseResponse insert(Employee employee) {
        BaseResponse baseResponse = new BaseResponse();
        try {
            employeeRepository.save(employee);
            baseResponse.setStatus(true);
            baseResponse.setMessage("新增成功");
        }catch (Exception e){
            baseResponse.setStatus(false);
            baseResponse.setMessage("新增失敗");
        }
        return baseResponse;
    }

    @Override
    public BaseResponse update(Employee employee) {
        BaseResponse baseResponse = new BaseResponse();
        try {
            employeeRepository.save(employee);
            baseResponse.setStatus(true);
            baseResponse.setMessage("修改成功");
        }catch (Exception e){
            baseResponse.setStatus(false);
            baseResponse.setMessage("修改失敗");
        }
        return baseResponse;
    }

    @Override
    public BaseResponse delete(Integer id) {
        BaseResponse baseResponse = new BaseResponse();
        try {
            employeeRepository.deleteById(id);
            baseResponse.setStatus(true);
            baseResponse.setMessage("刪除成功");
        }catch (Exception e){
            baseResponse.setStatus(false);
            baseResponse.setMessage("刪除失敗");
        }
        return baseResponse;
    }

    @Override
    public BaseResponse register(Employee employee) {
        BaseResponse baseResponse = new BaseResponse();
        try {
            String account = employee.getAccount();
            Employee existedEmployee = employeeRepository.getEmployeeByAccount(account);
            if (existedEmployee != null) {
                baseResponse.setMessage("帳號已存在");
                baseResponse.setStatus(false);
            }
            employeeRepository.save(employee);
            baseResponse.setMessage("註冊成功");
            baseResponse.setStatus(true);
        }catch (Exception e) {
            baseResponse.setMessage("註冊失敗");
            baseResponse.setStatus(false);
        }
        return baseResponse;
    }
}
