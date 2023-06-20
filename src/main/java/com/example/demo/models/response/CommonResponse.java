package com.example.demo.models.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class CommonResponse {
    private String code;
    private String status;
    private String message;
}
