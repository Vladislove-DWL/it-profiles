package com.camp.itprofiles.dto.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;

@Builder
public record AccessResponse(
        @Schema(description = "Id пользователя, пытающегося получить доступ",
                example = "121")
        Long userId
) {

}
