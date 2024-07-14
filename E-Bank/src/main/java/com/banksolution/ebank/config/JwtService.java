package com.banksolution.ebank.config;

import org.springframework.stereotype.Service;

@Service
public class JwtService {
    public String extractUserName(String token) {
        return token.substring(7);
    }
}
