package com.bezkoder.springjwt.common.process;

import com.bezkoder.springjwt.common.dto.ErrorDto;
import com.bezkoder.springjwt.common.exception.ProcessException;
import com.bezkoder.springjwt.common.request.AbstractRequest;
import com.bezkoder.springjwt.common.response.AbstractResponse;

import java.util.List;

public abstract class AbstractProcess {

    public AbstractProcess(){
    }

    public AbstractResponse execute(AbstractRequest request)throws ProcessException {
        return execute(request,null);
    }
    public AbstractResponse execute(AbstractRequest request,AbstractResponse perentresponse)throws ProcessException{
        AbstractResponse response=createNewResponse(request);
        //porcess
        try {
            beforeProcess(request,response);
            process(request,response);
        }catch (ProcessException processException){
            List<ErrorDto> errorDtoList=getListErrorDto((ProcessException)processException);
            response.setListError(errorDtoList);
        }
        //
        return response;
    }

    protected AbstractResponse createNewResponse(AbstractRequest request){
        return new AbstractResponse();
    }

    protected AbstractResponse process(AbstractRequest request,AbstractResponse response) throws  ProcessException{
        return null;
    }

    protected void beforeProcess(AbstractRequest request,AbstractResponse response) throws  ProcessException{
    }

    public List<ErrorDto> getListErrorDto(ProcessException e){
        return e.getErrorDtoList();
    }

}
