package ru.javafortesters.competitions.model;

public class Cat extends Sportsman {

    public static final String OBJECT_CLASS = "Кот";
    public static final String SUCCESFULL_RUN_RESULT = " стремительно преодолел ";
    public static final String BAD_RUN_RESULT = " не дополз до финиша и дальше не участвует.";
    public static final String SUCCESFULL_JUMP_RESULT = " не считает препятствием стенку высотой ";
    public static final String BAD_JUMP_RESULT = " не смог прыгнуть так высоко и отправляется тренироваться на кошках.";

  public Cat(String name, int maxdistance, double maxheight) {
        super(name,maxdistance,maxheight);
        super.info= OBJECT_CLASS + " по кличке " + name;
        super.succesfulrunresult=SUCCESFULL_RUN_RESULT;
        super.badrunresult=BAD_RUN_RESULT;
        super.succesfuljumpresult=SUCCESFULL_JUMP_RESULT;
        super.badjumpresult=BAD_JUMP_RESULT;
    }
}
