package com.krv.CollTest;

import java.util.*;

public class CollTest {

  /**
   * @param args
   */
  public static void main(String[] args) {
    String [] thing1= {"one","two","three","four","five"};
    LinkedList<String> list1 = new LinkedList<String>(Arrays.asList(thing1));
  /*  for(String s1: thing1){
      list1.add(s1);
    }*/
    
    String [] thing2= {"1one","3three","2two","4four","5five"};
    LinkedList<String> list2 = new LinkedList<String>(Arrays.asList(thing2));
    String[] stuff = list2.toArray(new String[list2.size()]);
    Collections.sort(list2,Collections.reverseOrder());
    for(String s2: list2){
      System.out.printf("%s ",s2);
    }
    System.out.println();
    
    list1.addAll(list2);
    list2=null;
    printMe(list1);
    removeStuff(list1, 2,5);
    printMe(list1);
    reverse(list1);
  }
  public static void printMe(List<String> l1){
    for(String s1: l1)
      System.out.printf("%s ",s1);
    System.out.println();
  }
  
  public static void removeStuff(List<String> l1, int from, int to){
    l1.subList(from, to).clear();
  }
  
  public static void reverse(List<String> l1){
    ListIterator<String> ls = l1.listIterator(l1.size());
    while(ls.hasPrevious())
      System.out.printf("%s ",ls.previous());
    System.out.println();
  }
}
