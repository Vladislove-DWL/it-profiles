package com.camp.itprofiles.mapper;

import com.camp.itprofiles.dto.WorkerProfileDTO;
import com.camp.itprofiles.model.Worker;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface WorkerProfileMapper extends Mappable<Worker, WorkerProfileDTO>{

    WorkerProfileMapper INSTANCE = Mappers.getMapper(WorkerProfileMapper.class);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Worker updateEntity(@MappingTarget Worker entity, WorkerProfileDTO dto);
}
