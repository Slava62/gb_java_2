package ru.javafortesters.competitions.services;

public interface IMotion {
    boolean jump(double height, double maxheight);
    boolean run(int distance, int maxdistance);
}
