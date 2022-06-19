package com.bezkoder.springjwt.common.request;

import com.bezkoder.springjwt.common.dto.AbstracDto;
import com.bezkoder.springjwt.common.dto.RequestDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AbstractRequest extends AbstracDto {
    private RequestDto accessInfo=new RequestDto();
}
