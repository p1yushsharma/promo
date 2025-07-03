package com.demo.promo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "login.modal")
public class LoginModalConfig {
    private String loginTabText;
    private String signupTabText;
    private LoginForm loginForm;
    private SignupForm signupForm;

    @Data
    public static class LoginForm {
        private String emailPlaceholder;
        private String passwordPlaceholder;
        private String buttonText;
    }

    @Data
    public static class SignupForm {
        private String namePlaceholder;
        private String emailPlaceholder;
        private String passwordPlaceholder;
        private String buttonText;
    }
}
