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
    public void setValue(int newValue) {
        this.value = newValue;
    }

    //method
    public void lancerDice(){
        setValue((int)(1+ 6*Math.random()));
    }
    public void lancerDice1(){
        boolean parite =loiBernoulli(0.5);
        if (parite==true) {
            double tirage = (int)loiUniformeContinue(1, 4);
            if(tirage==1){
                setValue(2);
            }else if(tirage==2){
                setValue(4);
            } else {
                setValue(6);
            }
        } else {
            int tirage =(int)loiUniformeContinue(1, 4);
            if(tirage==1){
                setValue(1);
            }else if(tirage==2){
                setValue(3);
            } else {
                setValue(5);
            }
        }
    }

    //laws
    public static double loiUniformeContinue(int min, int max) {
        return Math.random()*(max-min) + 1;
    }

    public static double loiUniformeDiscrete() {
        double continu = loiUniformeContinue(1,7);
        return Math.floor(continu);
    }

    public boolean loiBernoulli(double p){
        if (!(p >= 0.0 && p <= 1.0))
            throw new IllegalArgumentException("probability p must be between 0.0 and 1.0: " + p);
        boolean result = true;
        if(loiUniformeContinue(0,1)-1 < p){
            result= true;
        } else {
            return false;
        }
        return result;
    }
}