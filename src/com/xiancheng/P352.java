package com.xiancheng;
class MyThreal extends Thread{
		public MyThreal (String name) {
			super(name);
		}
		
		public void run() {
			int i=0;
			while (i++<5) {
				System.out.println(Thread.currentThread().getName()+"的run()方法在运行");
				
			}
			
		}
}

public class P352 {

	public static void main(String[] args) {
		MyThreal thread1=new MyThreal("thread1");
		thread1.start();
		
		MyThreal thread2=new MyThreal("thread2");
		thread2.start();

	}

}