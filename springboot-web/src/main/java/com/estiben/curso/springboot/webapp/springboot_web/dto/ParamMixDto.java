package com.estiben.curso.springboot.webapp.springboot_web.dto;

public class ParamMixDto extends ParamDto{
    private Integer code;
    
    public ParamMixDto(String message, Integer code){
        super(message);
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    
}
