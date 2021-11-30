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
		
		
	}

}
