package com.camp.itprofiles.exception;

import lombok.Builder;

@Builder
public record ErrorMessage(
        int statusCode,
        String description
) {
}
