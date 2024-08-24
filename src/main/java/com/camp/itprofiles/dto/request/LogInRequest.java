package com.camp.itprofiles.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;


public record LogInRequest(

        @Schema(description = "email пользователя",
                example = "roman@mail.com")
        String email,

        @Schema(description = "Пароль пользователя",
                example = "sfdhkjfshdk")
        String password
){
}
