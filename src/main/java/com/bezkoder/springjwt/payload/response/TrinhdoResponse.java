package com.bezkoder.springjwt.payload.response;

import com.bezkoder.springjwt.common.response.AbstractResponse;
import com.bezkoder.springjwt.models.TrinhDo;
import com.bezkoder.springjwt.payload.request.TrinhdoRequest;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class TrinhdoResponse extends AbstractResponse {
    private List<TrinhDo> list;
}
