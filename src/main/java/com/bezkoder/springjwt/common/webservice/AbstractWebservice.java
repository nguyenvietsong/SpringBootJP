package com.bezkoder.springjwt.common.webservice;

import com.bezkoder.springjwt.common.process.AbstractProcess;
import com.bezkoder.springjwt.common.request.AbstractRequest;
import com.bezkoder.springjwt.common.response.AbstractResponse;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class AbstractWebservice {

    public AbstractResponse executeProcess(AbstractRequest request){

        AbstractResponse response=null;
        try {
            response=getProcess().execute(request);
        }catch (Exception e){
           log.info("Error" + e);
        }finally {
            log.info("Access :");
        }
        return  response;
    }

    protected abstract AbstractProcess getProcess();
}
