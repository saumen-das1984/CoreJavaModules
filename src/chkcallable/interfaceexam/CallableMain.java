package chkcallable.interfaceexam;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableMain {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService service = Executors.newSingleThreadExecutor();
		CallableFactorialTask task = new CallableFactorialTask(5);
		Future<Integer> f = service.submit(task);
		Integer val = f.get();
		System.out.println(val);
		service.shutdown();
	}
}
