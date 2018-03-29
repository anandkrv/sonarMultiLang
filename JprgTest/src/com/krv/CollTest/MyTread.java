package com.krv.CollTest;

public class MyTread extends Thread {

  /**
   * @param args
   */
  public String s;
  public MyTread(String s){
    this.s= s;
  }
  public void run(){
    System.out.println(s);
  }
  
}
