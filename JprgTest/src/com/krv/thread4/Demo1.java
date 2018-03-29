package com.krv.thread4;

import java.util.Scanner;

class Processor extends Thread{
  private volatile boolean runningFlag =true;
  
  public void run() {
    
    while(runningFlag){
      System.out.println("Hello");
      
      try {
        Thread.sleep(100);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    
  }
  
  public void shutdown(){
    runningFlag = false;
  }
}

public class Demo1 {
  
  public static void main(String[] args) {
    Processor proc1 = new Processor();
    proc1.start();
    
    System.out.println("press return to stop ...");
    Scanner sc = new Scanner(System.in);
    sc.nextLine();
    
    proc1.shutdown();
  }
}

