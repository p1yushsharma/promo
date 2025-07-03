package com.demo.promo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.demo.promo.models.Product;

import java.util.List;

@Controller
public class GlobalController {

    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("pageTitle", "Home");
        model.addAttribute("pageId", "home");
        return "home";
    }

    @GetMapping("/aboutus")
    public String about(Model model) {
        model.addAttribute("pageTitle", "About Us");
        model.addAttribute("pageId", "about");  
        return "about";
    }

    @GetMapping("/contactus")
    public String contact(Model model) {
        model.addAttribute("pageTitle", "Contact Us");
        model.addAttribute("pageId", "contact");  
        return "contact";
    }

    @GetMapping("/products")
    public String products(Model model) {
        model.addAttribute("pageTitle", "Products");
        model.addAttribute("pageId", "products");

        List<Product> products = List.of(
            new Product("Copper Wire 1mm", "High-conductivity copper wire for residential use.", "/images/copper1.jpg"),
            new Product("Aluminium Wire 2.5mm", "Lightweight and durable for industrial wiring.", "/images/aluminium2.jpg"),
            new Product("Steel Cable", "Heavy-duty steel cable ideal for construction.", "/images/steel-cable.jpg")
        );
        model.addAttribute("products", products);
        return "products";
    }

    @GetMapping("/shop")
    public String shop(Model model) {
        model.addAttribute("pageTitle", "Shop");
        model.addAttribute("pageId", "shop");

        List<Product> products = List.of(
            new Product("Copper Wire 1mm", "High-conductivity copper wire for residential use.", "/images/copper1.jpg"),
            new Product("Aluminium Wire 2.5mm", "Lightweight and durable for industrial wiring.", "/images/aluminium2.jpg"),
            new Product("Steel Cable", "Heavy-duty steel cable ideal for construction.", "/images/steel-cable.jpg"),
            new Product("Fiber Optic Cable", "High-speed cable for internet & communication.", "/images/fiber.jpg"),
            new Product("PVC Insulated Wire", "Economical and flexible for indoor applications.", "/images/pvc.jpg")
        );

        model.addAttribute("products", products);
        return "shop";
    }
}
