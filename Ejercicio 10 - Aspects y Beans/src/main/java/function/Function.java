package function;

import org.springframework.stereotype.Component;

@Component
public class Function
{

	public void add (int a, int b){
		try {
			Thread.sleep(1000); //Agregar un retraso de 1 segundo
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		System.out.println("Suma:" + (a+b));
	}
	public void substract (int a, int b){
		try {
			Thread.sleep(1000); //Agregar un retraso de 1 segundo
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		System.out.println("Resta:" + (a-b));
	}
	public void multiply (int a, int b){
		try {
			Thread.sleep(1000); //Agregar un retraso de 1 segundo
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		System.out.println("Multiplicación:" + (a*b));
	}
	public void divide (int a, int b){
		try {
			Thread.sleep(1000); //Agregar un retraso de 1 segundo
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		if(b == 0) System.out.println("No es posible dividir entre 0");
		else {System.out.println("División:" + (a / b));}
	}
}