package com.bezkoder.springjwt.payload.request;

import com.bezkoder.springjwt.common.request.AbstractRequest;
import lombok.Data;

import java.util.List;

@Data
public class TrinhdoRequest {
      private String accessToken;
      private String email;
      private List<String> roles;
      private String username;
      private Long id;
}
