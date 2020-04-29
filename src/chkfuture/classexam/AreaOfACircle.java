package chkfuture.classexam;

import java.util.concurrent.Callable;

public class AreaOfACircle implements Callable<Double> {
	double rad = 0.0;

	public AreaOfACircle(double d) {
		rad = d;
	}

	@Override
	public Double call() throws Exception {
		return Math.PI * rad * rad;
	}

}
