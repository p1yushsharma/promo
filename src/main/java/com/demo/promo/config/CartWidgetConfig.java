package com.demo.promo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "cart.widget")
public class CartWidgetConfig {
    private String title;
    private String emptyMessage;
    private String totalLabel;
    private String checkoutButton;
    private String currencySymbol;
    private Quantity quantity = new Quantity();

    @Data
    public static class Quantity {
        private String increaseButton;
        private String decreaseButton;
    }
}
