package com.xwh.demo.exception;

import com.xwh.demo.utils.Result;
import com.xwh.demo.utils.ReturnEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import javax.validation.ConstraintViolationException;
import java.util.List;

@RestControllerAdvice
public class GlobalExceptionHandler {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * 处理请求对象属性不满足校验规则的异常信息
     * @param request
     * @param exception
     * @return
     */
    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public Result exception(HttpServletRequest request,MethodArgumentNotValidException exception){
        BindingResult bindingResult = exception.getBindingResult();
        final List<FieldError> fieldErrors = bindingResult.getFieldErrors();
        StringBuilder builder = new StringBuilder();
        for (FieldError error : fieldErrors){
            builder.append(error.getDefaultMessage() + "\n");
        }

        return new Result(ReturnEnum.FAIL,exception.getMessage());
    }

    /**
     * 处理请求单个参数不满足校验规则的异常信息
     * @param request
     * @param exception
     * @return
     */
    @ExceptionHandler(value = ConstraintViolationException.class)
    public Result constraintViolationExceptionHandler(HttpServletRequest request, ConstraintViolationException exception) {
        logger.info(exception.getMessage());
        return new Result(ReturnEnum.FAIL, exception.getMessage());
    }

    /**
     * 处理未定义的其他异常信息
     * @param request
     * @param exception
     * @return
     */
    @ExceptionHandler(value = Exception.class)
    public Result exceptionHandler(HttpServletRequest request, Exception exception) {
        logger.error(exception.getMessage());
        return new Result(ReturnEnum.FAIL, exception.getMessage());
    }
}
