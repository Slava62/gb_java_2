package ru.javafortesters.competitions.model;

import ru.javafortesters.competitions.services.IMotion;
import ru.javafortesters.competitions.services.Motion;

// Базовый класс для классов Human, Cat, Robot
public abstract class Sportsman {
    protected String info;
    protected int maxdistance;
    protected double maxheight;
    protected String succesfulrunresult;
    protected String badrunresult;
    protected String succesfuljumpresult;
    protected String badjumpresult;
    private boolean condition;
    private IMotion motion;
    Sportsman(String name, int maxdistance, double maxheight){
        this.info = "";
        this.maxdistance=maxdistance;
        this.maxheight=maxheight;
        this.succesfulrunresult="";
        this.badrunresult = "";
        this.succesfuljumpresult="";
        this.badjumpresult="";
        this.condition=true;
        this.motion=new Motion();
    }
    // Информация о спортмене вида "Человек по имени Марк" или "Кот по имени Барсик"
    public String getInfo() {
        return info;
    }
    // Бежать дистанцию. Сравнивается длина дорожки и возможность ее пробежать
    public String getRunResult(int distance){
        if (motion.run(distance,maxdistance) && condition){
            return info  +  succesfulrunresult + distance + " м";}
        condition=false;
        return  info + badrunresult;
    }
    // Прыгать через стенку. Сравнивается высота стенки и возможность ее перепрыгнуть
    public String getJumpResult(double height){
        if (motion.jump(height,maxheight) && condition){
            return info  +  succesfuljumpresult + height + " м";}
        condition=false;
        return  info + badjumpresult;
    }
    // Получает состояние спортсмена. condotion = true - значит дальше участвует
    // или является победителем, если препятствия закончились
    public boolean getCondition(){return condition;}
}
