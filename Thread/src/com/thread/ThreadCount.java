package com.thread;

public class ThreadCount {

	public static void main(String[] args) {
		int count = 22;
		try {
			while(true)
			{
				
				Thread t = new Thread();
				t.start();
				if(count>0 && count/10000 ==0)
				{
					System.out.println("a:" + Thread.activeCount());
				}
				count++;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(">>>>>>>>>:" + Thread.activeCount());
		System.out.println("-------------" + count);
	}

}
