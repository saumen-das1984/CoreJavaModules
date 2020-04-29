package chkrunnable.interfaceexam;

public class RunnableFactorialTask implements Runnable{
	private int num = 0;

	public RunnableFactorialTask(int num) {
		this.num = num;
	}

	@Override
	public void run() {
		int prod = 1;
		for (int i = 2; i <= num; i++)
			prod *= i;
		System.out.println(prod);
	}
}
