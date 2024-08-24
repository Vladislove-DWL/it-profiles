package com.camp.itprofiles.dto;

import com.camp.itprofiles.model.SystemLevel;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import lombok.Builder;

@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public record WorkerProfileDTO(
        Long id,
        Long badge,
        String lastName,
        String firstName,
        String middleName,
        String birthday,
        String city,
        String email,
        String phone
) {
}
