/**
 * 
 */
package com.krv.phase1;

/**
 * @author KumarA07
 *
 */
public class ClubMember {
  private String firstName;
  private String lastName;
  private static int members = 0;
  
  public ClubMember(String fn, String ln){
    firstName = fn;
    lastName = ln;
    members++;
   System.out.printf("constructor for %s %s, members in the club: %d\n", firstName, lastName, members);
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
  
  public static int getMembers(){
    return members;
  }

}
