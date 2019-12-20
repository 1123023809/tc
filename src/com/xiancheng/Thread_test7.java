package com.xiancheng;
	class DamonThread implements Runnable{

		@Override
		public void run() {
			// TODO 自动生成的方法存根
			while(true) {
				System.out.println(Thread.currentThread().getName()+"---在运行");
			}
		}
		
	}
public class Thread_test7 {
	public static void main(String[] args) {
		System.out.println("main线程是后台线程ma？"+Thread.currentThread().isDaemon());
		DamonThread dThread=new DamonThread();
		Thread thread=new Thread(dThread,"后台线程");
		System.out.println("thread 线程默认是后台线程吗？"+thread.isDaemon());
		thread.setDaemon(true);
		thread.start();
		for (int i = 0; i <5; i++) {
			System.out.println(i);
		}
	}
}