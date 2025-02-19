package com.camp.itprofiles.mapper;


public interface Mappable<E, D> {

    D toDTO(E entity);

    E toEntity(D dto);
}
