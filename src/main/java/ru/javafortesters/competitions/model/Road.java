package ru.javafortesters.competitions.model;

// Создает дорожку
public class Road {
    private int length;
    public Road(int length){
        this.length=length;
    }
    // Возвращает длину дорожки
    public int getLength() {
        return length;
    }
}
