package com.demo.promo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@Component
@ConfigurationProperties(prefix = "footer")
public class FooterConfig {
    private ContactInfo contactInfo;  
    private List<PolicyLink> policyLinks;
    private List<PaymentIcon> paymentIcons;
    private String copyright;

    @Data
    public static class ContactInfo {  
        private String workTime;
        private String days;        
        private String phone;
        private String company;     
        private String gst;
        private String email;
    }

    @Data
    public static class PolicyLink {
        private String name;
        private String url;
    }

    @Data
    public static class PaymentIcon {
        private String imagePath;
        private String altText;
    }
}
