package ru.bobrysheva.first_spring_project.item;

public enum DayOfWeek {
    SUNDAY ("Воскресенье"), MONDAY ("Понедельник"), TUESDAY ("Вторник"),
    WEDNESDAY ("Среда"), THURSDAY ("Четверг"), FRIDAY ("Пятница"),
    SATURDAY ("Суббота");

    String translation;
    DayOfWeek () {

    }
    DayOfWeek (String translation) {
        this.translation = translation;
    }
    public String getDayOfWeek() {
        return translation;
    }
}
