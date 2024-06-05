package ru.bobrysheva.first_spring_project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.bobrysheva.first_spring_project.item.DayOfWeek;

@RestController
@RequestMapping("dayOfWeek")

public class MyController {
    @GetMapping ("/dayOfWeek")

    public String dayOfWeek (@RequestParam(value = "dayOfWeek", defaultValue = "Day of week") DayOfWeek dayOfWeek) {
     return String.format("Сегодня %s", dayOfWeek.getDayOfWeek());
    }
}
