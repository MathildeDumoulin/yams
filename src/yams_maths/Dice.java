package yams_maths;

public class Dice {
    private int value;

    public Dice() {
        this.value = 0;
    }   

    //getter
    public int getValue() {
        return value;
    }

    //setter
    public void setName(int newValue) {
        this.value = newValue;
    }

    //method
    public void lancerDice(){
        setName((int)(1+ 6*Math.random()));
    }
}