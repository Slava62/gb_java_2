package ru.javafortesters.competitions.model;

public class Robot extends Sportsman {

    public static final String OBJECT_CLASS = "Робот";
    public static final String SUCCESFULL_RUN_RESULT = " пробежал смешную для робота дистанцию ";
    public static final String BAD_RUN_RESULT = " устал, приуныл и выбывает из соревнований.";
    public static final String SUCCESFULL_JUMP_RESULT = " легко перепрыгнул стенку высотой ";
    public static final String BAD_JUMP_RESULT = " не смог преодолеть это препятствие, поэтому выбывает.";

    public Robot(String name, int maxdistance, double maxheight) {
        super(name,maxdistance,maxheight);
        super.info= OBJECT_CLASS + " с названием " + name;
        super.succesfulrunresult=SUCCESFULL_RUN_RESULT;
        super.badrunresult=BAD_RUN_RESULT;
        super.succesfuljumpresult=SUCCESFULL_JUMP_RESULT;
        super.badjumpresult=BAD_JUMP_RESULT;
    }

}
