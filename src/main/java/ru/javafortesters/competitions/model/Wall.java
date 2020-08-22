package ru.javafortesters.competitions.model;
// Создает стенку
public class Wall {
    private Double height;
    public Wall(Double height) {
        this.height = height;
    }
    //Возвращает высоту стенки
    public Double getHeight() {
        return height;
    }
}
