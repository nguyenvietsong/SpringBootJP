package com.bezkoder.springjwt.common.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ReponseDto extends AbstracDto{
    private List<ErrorDto> listError =new ArrayList<>();
}
