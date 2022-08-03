package com.bezkoder.springjwt.dtos;

import com.bezkoder.springjwt.models.TrinhDo;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
public class DethiDto {
    private Long id;
    private String tendethi;
    private int thoigianthi;
    private String trangthai;
    private TrinhDo trinhdo;
}
