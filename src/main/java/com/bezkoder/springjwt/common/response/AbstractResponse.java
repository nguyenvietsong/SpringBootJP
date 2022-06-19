package com.bezkoder.springjwt.common.response;

import com.bezkoder.springjwt.common.dto.AbstracDto;
import com.bezkoder.springjwt.common.dto.ErrorDto;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class AbstractResponse extends AbstracDto {
    private List<ErrorDto> listError=new ArrayList<>();
}
