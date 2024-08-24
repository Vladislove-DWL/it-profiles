package com.camp.itprofiles.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;

import java.sql.Timestamp;


public record SignUpRequest(

        @Schema(description = "Имя пользователя",
                example = "Roman")
        String firstName,

        @Schema(description = "Фамилия пользователя",
                example = "Zigmund")
        String lastName,

        @Schema(description = "Отчество пользователя",
                example = "Petrovich")
        String middleName,

        @Schema(description = "Дата рождения пользователя в формате YYYY-MM-DD",
                example = "2000-01-11")
        String birthday,

        @Schema(description = "Город проживания пользователя",
                example = "Москва")
        String city,

        @Schema(description = "Номер телефона пользователя",
                example = "+7999000000")
        String phone,

        @Schema(description = "Электронная почта пользователя, используемая в качестве логина",
                example = "roman@mail.com")
        String email,

        @Schema(description = "Пароль пользователя",
                example = "sfdhkjfshdk")
        String password

) {
}
