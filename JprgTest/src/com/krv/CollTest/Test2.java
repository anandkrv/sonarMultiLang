package com.krv.CollTest;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeSet;

public class Test2 {

  public static void main(String[] args) {

    // Prg 1
    ArrayList obj = new ArrayList();
    obj.add("A");
    obj.add("D");
    obj.ensureCapacity(3);
    obj.trimToSize();
    System.out.println(obj.size());

    // Prg 2
    byte a[] = { 65, 66, 67, 68, 69, 70 };
    byte b[] = { 71, 72, 73, 74, 75, 76 };
    System.arraycopy(b, 0, a, 0, a.length);
    System.out.println(new String(a) + "" + new String(b));

    // Prg 3
    char chara[] = { 'x', 'b', 'c' };
    String s = new String(chara);
    System.out.println(s);

    // Prg 3
    System.out.println(false | false);

    // Prg 4
/*
    TreeSet t = new TreeSet();
    t.add(new StringBuffer("H"));
    t.add(new StringBuffer("A"));
    t.add(new StringBuffer("C"));
    t.add(new StringBuffer("K"));
    System.out.println(t);*/
    
 // Prg 5
    MyTread t1 = new MyTread("1");
    MyTread t2 = new MyTread("2");
    t1.start();
    t2.start();
    System.out.println("3");
    
    float x =23423.232f;
   
    
    
    
  }

}
