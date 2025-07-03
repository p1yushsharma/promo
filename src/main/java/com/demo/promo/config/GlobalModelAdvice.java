package com.demo.promo.advice;

import com.demo.promo.config.FooterConfig;
import com.demo.promo.config.HeaderConfig;
import com.demo.promo.config.NavbarConfig;
import com.demo.promo.config.LoginModalConfig;
import com.demo.promo.config.CartWidgetConfig;
import com.demo.promo.config.LayoutConfig;
import com.demo.promo.config.HomePageConfig;
import com.demo.promo.config.AboutConfig;
import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

@ControllerAdvice
@RequiredArgsConstructor
public class GlobalModelAdvice {

    private final HeaderConfig headerConfig;
    private final FooterConfig footerConfig;
    private final NavbarConfig navbarConfig;
    private final LoginModalConfig loginModalConfig;
    private final CartWidgetConfig cartConfig;
    private final LayoutConfig layoutConfig;
    private final HomePageConfig homePageConfig;
    private final AboutConfig aboutConfig;
    @ModelAttribute
    public void addGlobalAttributes(Model model) {
        model.addAttribute("header", headerConfig);
        model.addAttribute("footer", footerConfig);
        model.addAttribute("navbar", navbarConfig);
        model.addAttribute("loginModal", loginModalConfig);
        model.addAttribute("cartWidget", cartConfig);
        model.addAttribute("layout", layoutConfig);
        model.addAttribute("home", homePageConfig);
        model.addAttribute("about", aboutConfig);
    }
}
