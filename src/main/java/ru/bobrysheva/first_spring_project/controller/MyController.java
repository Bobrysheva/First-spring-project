package ru.bobrysheva.first_spring_project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.bobrysheva.first_spring_project.item.DayOfWeek;

@RestController

public class MyController {
    @GetMapping("/dayOfWeek")

    public String dayOfWeek(@RequestParam(value = "dayOfWeek", defaultValue = "Day of week") String dayOfWeek) {
        DayOfWeek day1 = DayOfWeek.valueOf(dayOfWeek);
        String translationOfDay = day1.getDayOfWeek();
        return String.format("Сегодня %s", translationOfDay);
    }
}
