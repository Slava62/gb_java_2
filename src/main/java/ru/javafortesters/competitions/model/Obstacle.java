package ru.javafortesters.competitions.model;
// Содает препятствие из дорожки и стены для полосы препятствий
public class Obstacle {
    private  Wall wall;
    private Road road;
    public Obstacle(Wall wall, Road road){
        this.road=road;
        this.wall=wall;
    }
    // Получает длину дорожки
    public int getRoadLength(){
    return road.getLength();
    }
    // Получает высоту стенки
    public Double getWallHeight(){
        return wall.getHeight();
    }
}
