package by.tami.userservice.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Tokens {
    private String accessToken;
    private String refreshToken;
}
