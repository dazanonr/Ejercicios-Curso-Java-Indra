package Ej2;

public class Calculum{
    int input;

    public Calculum(int input){
        this.input = input;
    }

     public double squareRoot(){
        return Math.sqrt(this.input);
    }

    public int factorial(int i){
        if(i<0){
            i = -i;
            System.out.println("Convertido número negativo a positivo");
        }
        if (i == 0 || i ==1) return 1;

        else return i * (factorial(i -1));
    }

    public int absoluteValor(){
        return Math.abs(this.input);
    }
}