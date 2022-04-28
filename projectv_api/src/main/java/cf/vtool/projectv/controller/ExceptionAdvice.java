package cf.vtool.projectv.controller;

import cf.vtool.projectv.exception.BusinessException;
import cf.vtool.projectv.exception.SystemException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
public class ExceptionAdvice {

    @ExceptionHandler(BusinessException.class)
    public R doBusinessException(BusinessException e){
        e.printStackTrace();
        return new R(e.getCode(),e.getMessage());
    }


    @ExceptionHandler(SystemException.class)
    public R doSystemException(SystemException e){
        log.error(e.getMessage());
        e.printStackTrace();
        return new R(e.getCode(),e.getMessage());
    }

    @ExceptionHandler(Exception.class)
    public R doException(Exception e){
        log.error(e.getMessage());
        e.printStackTrace();
        return new R(Code.SYSTEM_ERR,"系统繁忙,请稍后再试!");
    }
}
