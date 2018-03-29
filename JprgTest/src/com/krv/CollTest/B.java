package com.krv.CollTest;

import java.util.Arrays;

public class B {

  String s;
  int sid;
  /* (non-Javadoc)
   * @see java.lang.Object#hashCode()
   */
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((s == null) ? 0 : s.hashCode());
    result = prime * result + sid;
    return result;
  }
  /*asdasjl*/
  /* (non-Javadoc)
   * @see java.lang.Object#equals(java.lang.Object)
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    B other = (B) obj;
    if (s == null) {
      if (other.s != null) return false;
    } else if (!s.equals(other.s)) return false;
    if (sid != other.sid) return false;
    return true;
  }
  
  

}
