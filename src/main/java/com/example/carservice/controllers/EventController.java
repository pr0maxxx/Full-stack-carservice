package com.example.carservice.controllers;

import com.example.carservice.models.Event;
import com.example.carservice.services.EventService;
import com.example.carservice.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class EventController {
    private final EventService eventService;
    private final ProductService productService;

    @PostMapping("/product/createEvent/")
    public String createEvent(Event event){
        eventService.saveEvent(event);
        return "redirect:/";
    }

    @PostMapping("/product/deleteEvent/{id}")
    public String deleteEvent(@PathVariable Long id) {
        eventService.deleteEvent(id);
        return "redirect:/";
    }
}