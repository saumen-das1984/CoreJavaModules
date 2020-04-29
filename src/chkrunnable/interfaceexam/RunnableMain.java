package chkrunnable.interfaceexam;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableMain {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService service = Executors.newSingleThreadExecutor();
		RunnableFactorialTask task = new RunnableFactorialTask(5);
		service.execute(task);
		service.shutdown();
	}
}
