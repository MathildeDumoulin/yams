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
        boolean parite =loiBernoulli(0.7);
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
    
    public void lancerDice2() {
    	int res = (int) Math.floor(loiUniformeContinue(1,7));
    	setValue(res);
    }
    
    public void lancerDice3(double p) {
    	int res = loiBinomiale(p);
    	setValue(res);
    }

    public void lancerDice4(){
        boolean parite =loiBernoulli(0.3);
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
    
    public int loiBinomiale(double p) {
		int count = 1;
		for(int i = 0; i < 5; i++) {
			double rand = loiUniformeContinue(0,1)-1;
			int plus = rand < p ? 1 : 0;
			count += plus;
		}
		return count;
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
            throw new IllegalArgumentException("La probabilité doit être comprise entre 0.0 et 1.0, or: " + p);
        boolean result = true;
        if(loiUniformeContinue(0,1)-1 < p){
            result= true;
        } else {
            return false;
        }
        return result;
    }
}