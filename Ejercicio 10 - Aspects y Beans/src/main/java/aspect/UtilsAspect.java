package aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class UtilsAspect
{
	private  long startTime, endTime;
	@Before("execution(* function.Function.*(..))")
	public void addTime() {
		this.startTime = System.currentTimeMillis();
		System.out.println("Tiempo de la anterior función: " + System.currentTimeMillis());
	}

	@After("execution(* function.Function.*(..))")
	public void addEndMessage() {
		this.endTime = System.currentTimeMillis();
		System.out.println("¡Hecho! " + (endTime - startTime));
	}
}
