package com.kai.shoppingmall.service;

import com.kai.shoppingmall.entity.ProblemReport;
import com.kai.shoppingmall.response.BaseResponse;

public interface IProblemReportService {
    BaseResponse findAll();

    BaseResponse select(Integer id);

    BaseResponse insert(ProblemReport problemReport);

    BaseResponse update(ProblemReport problemReport);

    BaseResponse delete(Integer id);
}
