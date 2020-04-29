package chkcallable.interfaceexam;

import java.util.concurrent.Callable;

public class CallableFactorialTask implements Callable<Integer> {
	private int num = 0;
	   public CallableFactorialTask(int num){
	      this.num = num;
	   }
	   @Override
	   public Integer call() throws Exception {
	      int prod = 1;
	      for (int i = 2; i <= num; i++)
	         prod *= i;
	      return prod;
	   }
}
