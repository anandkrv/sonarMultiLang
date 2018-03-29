package com.krv.thread2;

class RunThread implements Runnable{
  public void run() {
    for(int i=0;i<10;i++){
      System.out.println("Hello "+i);
      
      try {
        Thread.sleep(100);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    
  }
}

public class Demo1 {
  
  public static void main(String[] args) {
    Thread t1 = new Thread(new RunThread());
    Thread t2 = new Thread(new RunThread());
    
    t1.start();
    t2.start();
  }
}
