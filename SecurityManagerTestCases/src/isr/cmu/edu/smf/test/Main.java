package isr.cmu.edu.smf.test;

public class Main {
	public static void main(String[] args) {
		SecurityManager blankManager = new SecurityManager();
		System.setSecurityManager(null);
		System.setSecurityManager(blankManager);
	}
}
