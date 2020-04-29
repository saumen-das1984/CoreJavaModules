package chkfuture.classexam;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableMain {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService service = Executors.newFixedThreadPool(3);
		Future<Double> f1 = service.submit(new AreaOfACircle(12.5));
		Future<Integer> f2 = service.submit(new FactorialTask(7));
		Future<Double> f3 = service.submit(new CircumOfACircle(12.5));
		System.out.println("Area of Circle (radius 12.5) = " + f1.get());
		System.out.println("Factorial of 7 = " + f2.get());
		System.out.println("Circumference (radius 12.5) = " + f3.get());
		service.shutdown();
	}
}
