package chkfuture.classexam;

import java.util.concurrent.Callable;

public class FactorialTask implements Callable<Integer> {
	private int num = 0;

	public FactorialTask(int num) {
		this.num = num;
	}

	@Override
	public Integer call() throws Exception {
		int prod = 1;
		if (num > 1) {
			for (int i = 2; i <= num; i++)
				prod *= i;
		}
		return prod;
	}
}