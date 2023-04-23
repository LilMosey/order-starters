package com.mosey.ddd.buy.starter.exceptionhandler;

import com.mosey.ddd.web.placeorder.res.ApiResult;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletResponse;

/**
 * @author TangJie
 * @since 2023/4/19
 */
@RestControllerAdvice
public class ExceptionHandler {
    @org.springframework.web.bind.annotation.ExceptionHandler({Exception.class})
    public ApiResult<String> handler(
            Exception exception, HttpServletResponse httpServletResponse) {
        return ApiResult.fail("500",exception.getMessage());
    }
}
