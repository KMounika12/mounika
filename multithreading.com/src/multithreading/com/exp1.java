package multithreading.com;

public class exp1 {

	public static void main(String[] args) {
		System.out.println("hello java");
		System.out.println("welcome java");
		Thread t= Thread.currentThread();
		System.out.println("current thread information:"+t);
		System.out.println("current thread priority:"+t.getPriority());
		System.out.println("current thread information:"+t.getName());

	}

}
