package com.stephenk.hsms.dto;

import com.stephenk.hsms.model.Class;

public record ClassDTO(String name, String classTeacherId) {
    public Class toClass(){
        return Class.builder()
        .name(name)
        .classTeachedId(classTeacherId)
        .build();
    }
    public ClassDTO fromClass(Class cls){
        return  new ClassDTO(cls.getName(),cls.getClassTeachedId());
    }
}