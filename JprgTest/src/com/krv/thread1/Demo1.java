package com.krv.thread1;

class RunThread extends Thread{
  @Override
  public void run() {
    for(int i=0;i<10;i++){
      System.out.println("Hello "+i);
      
      try {
        Thread.sleep(100);
      } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    }
    
  }
  
}

public class Demo1 {
  
  public static void main(String[] args) {
    RunThread runner1 = new RunThread();
    runner1.start();
    
    RunThread runner2 = new RunThread();
    runner2.start();
  }
}
