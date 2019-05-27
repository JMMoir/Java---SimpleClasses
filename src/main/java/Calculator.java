public class Calculator {

    private int numberOne;
    private int numberTwo;

    public Calculator(int numberOne, int numberTwo){
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
    }

    public int getNumberOne(){
        return numberOne;
    }

    public int getNumberTwo(){
        return numberTwo;
    }

    public int add(){
        return numberOne + numberTwo;
    }

    public int subtract(){
        return numberTwo - numberOne;
    }

    public int multiply(){
        return numberOne * numberTwo;
    }

    public double divide(){
        return (double) numberTwo / (double) numberOne;
    }


}
