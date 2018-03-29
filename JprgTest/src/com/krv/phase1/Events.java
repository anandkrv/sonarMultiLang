package com.krv.phase1;

public class Events {

  public static void main(String[] args) {
    ClubMember member1 = new ClubMember("Anand", "Kumar");
    ClubMember member2 = new ClubMember("vineet", "V");
    ClubMember member3 = new ClubMember("Nagamni", "N");
    ClubMember member4 = new ClubMember("Devendra", "Anurag");
    
    System.out.println(member1.getFirstName());
    System.out.println(member1.getLastName());
    System.out.println(member1.getMembers());
  }

}
