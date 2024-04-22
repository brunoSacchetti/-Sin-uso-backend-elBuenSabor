package com.example.BackEndElBuenSabor.domains.dtos;

import lombok.Builder;

@Builder
public class ErrorDto {
    private String errorMsg;
    private String errorClass;
}
