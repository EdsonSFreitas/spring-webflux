package br.com.edsonsf.webflux.model.response;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public record UserResponse(
        String id,
        String name,
        String email,
        @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
        String password
) { }
