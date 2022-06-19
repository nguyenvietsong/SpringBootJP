package com.bezkoder.springjwt.common.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
@RequiredArgsConstructor
public class RequestDto extends AbstracDto{
    private Long id;
    private String accessToken;
    private String email;
    private String username;
    private List<String> roles;

}
