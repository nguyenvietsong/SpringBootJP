package com.bezkoder.springjwt.common.exception;

import com.bezkoder.springjwt.common.dto.ErrorDto;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
public class ProcessException extends Exception{
    private List<ErrorDto> errorDtoList=new ArrayList<>();
    public ProcessException(){
        super();
    }
    public ProcessException(Exception e){
        super(e);
    }

    public ProcessException(List<ErrorDto> msg){
        setErrorDtoList(msg);
    }

}
