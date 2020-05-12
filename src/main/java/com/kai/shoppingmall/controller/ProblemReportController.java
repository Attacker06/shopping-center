package com.kai.shoppingmall.controller;

import com.kai.shoppingmall.entity.ProblemReport;
import com.kai.shoppingmall.response.BaseResponse;
import com.kai.shoppingmall.service.impl.ProblemReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/problemReport")
public class ProblemReportController {

    @Autowired
    ProblemReportService problemReportService;

    @GetMapping("/findAll")
    public BaseResponse findAll(){
        return problemReportService.findAll();
    }

    @PostMapping("/insert")
    public BaseResponse insert(@RequestBody ProblemReport problemReport){
        return problemReportService.insert(problemReport);
    }

    @GetMapping("/select")
    public BaseResponse select(@RequestParam Integer id){
        return problemReportService.select(id);
    }

    @PutMapping("/update")
    public BaseResponse update(@RequestBody ProblemReport problemReport){
        return problemReportService.update(problemReport);
    }

    @DeleteMapping("/delete")
    public BaseResponse delete(@RequestParam Integer id){
        return problemReportService.delete(id);
    }
}
