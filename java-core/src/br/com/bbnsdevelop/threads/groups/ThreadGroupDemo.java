package br.com.bbnsdevelop.threads.groups;

public class ThreadGroupDemo {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getThreadGroup().getName());
		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());

		
		ThreadGroup parent = new ThreadGroup("Parent");
		System.out.println(parent.getName());
		
		System.out.println("-------------");
		
		ThreadGroup child = new ThreadGroup(parent, "Child");
		
		System.out.println(child.getName());
		System.out.println(child.getParent().getName());
		
		Thread t1 = new Thread(child, "Thread 1");
		Thread t2 = new Thread(child, "Thread 2");
		
		System.out.println(t1.getThreadGroup().getName());
		System.out.println(t2.getThreadGroup().getName());
		
		System.out.println("Thread 1 - priority: " + t1.getPriority());
		System.out.println("Thread 2 - priority: " + t2.getPriority());
		
		child.setMaxPriority(4);
		Thread t3 = new Thread(child, "Thread 3");
		Thread t4 = new Thread(child, "Thread 4");
		
		System.out.println("Change priority for -------------> 4");		
		System.out.println("Thread 3 - priority: " + t3.getPriority());
		System.out.println("Thread 4 - priority: " + t4.getPriority());
		
		System.out.println("The priority of objects t1 and t2 don't change because the priority was changed after your creation");
		System.out.println("Thread 1 - priority: " + t1.getPriority());
		System.out.println("Thread 2 - priority: " + t2.getPriority());
		
	}

}
