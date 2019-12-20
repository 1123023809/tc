package com.xiancheng;
class TickeTwindow extends Thread{
	private int tickets=100;
	public void run() {
		while (true) {
			if (tickets>10) {
				System.out.println(Thread.currentThread().getName()+"正在发售第"+tickets--+"张票");
				
			}
			
		}
		
	}{
		
	}
}
public class Thread_test4 {

	public static void main(String[] args) {
			new TickeTwindow().start();
			new TickeTwindow().start();
			new TickeTwindow().start();
			new TickeTwindow().start();
			

	}

}