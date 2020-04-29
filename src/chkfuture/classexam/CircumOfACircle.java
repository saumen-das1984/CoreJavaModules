package chkfuture.classexam;

import java.util.concurrent.Callable;

public class CircumOfACircle implements Callable<Double> {
	double rad = 0.0;

	public CircumOfACircle(double d) {
		rad = d;
	}

	@Override
	public Double call() throws Exception {
		return 2 * Math.PI * rad;
	}
}