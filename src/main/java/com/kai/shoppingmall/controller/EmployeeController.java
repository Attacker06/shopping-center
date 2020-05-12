package com.kai.shoppingmall.controller;

import com.kai.shoppingmall.entity.Employee;
import com.kai.shoppingmall.response.BaseResponse;
import com.kai.shoppingmall.service.impl.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {


    @Autowired
    EmployeeService employeeService;

    @GetMapping("/findAll")
    public BaseResponse findAll(){
        return employeeService.findAll();
    }

    @PostMapping("/insert")
    public BaseResponse insert(@RequestBody Employee employee){
        return employeeService.insert(employee);
    }

    @GetMapping("/select")
    public BaseResponse select(@RequestParam Integer id){
        return employeeService.select(id);
    }

    @PutMapping("/update")
    public BaseResponse update(@RequestBody Employee employee){
        return employeeService.update(employee);
    }

    @DeleteMapping("/delete")
    public BaseResponse delete(@RequestParam Integer id){
        return employeeService.delete(id);
    }
}

