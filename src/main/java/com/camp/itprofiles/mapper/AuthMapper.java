package com.camp.itprofiles.mapper;

import com.camp.itprofiles.dto.request.SignUpRequest;
import com.camp.itprofiles.model.Worker;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface AuthMapper extends Mappable<Worker, SignUpRequest>{

    AuthMapper INSTANCE = Mappers.getMapper(AuthMapper.class);
}
