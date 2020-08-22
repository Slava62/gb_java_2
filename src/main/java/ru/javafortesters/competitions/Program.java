package ru.javafortesters.competitions;

import ru.javafortesters.competitions.model.*;

public class Program {

    public static void main(String[] args) {
        // Первая команда участников
        Team team1= new Team("Winners 1990");
        team1.addSportsmam( new Human("Mark",400,0.9));
        team1.addSportsmam( new Cat("Leonard", 120, 0.5));
        team1.addSportsmam( new Robot("Terminator",2000,1.8));
        // Вторая команда участников
        Team team2 = new Team("Winners 2000");
        team2.addSportsmam( new Human("Fill",800,0.5));
        team2.addSportsmam( new Cat("Markiz", 500, 0.9));
        team2.addSportsmam( new Robot("Robochild",180,0.3));
        // Полоса препятствий из дорожек и стенок
        ObstacleCourse course1=new ObstacleCourse();
        course1.obstacleAdd(new Obstacle(new Wall(0.2), new Road(100)));
        course1.obstacleAdd(new Obstacle(new Wall(0.8), new Road(300)));
        course1.obstacleAdd(new Obstacle(new Wall(1.5), new Road(1500)));
        // Участвует первая команда
        team1.getTeamInfo();
        team1.startCompetition(course1.getObstacles());
        // Участвует вторая команда
        team2.getTeamInfo();
        team2.startCompetition(course1.getObstacles());
        // Определяем победителя
        team1.getWinner();
        team2.getWinner();
    }
}
