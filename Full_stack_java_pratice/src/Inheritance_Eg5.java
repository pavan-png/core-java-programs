// Parent class
class Money {

  // Private variable
  // 'private' means this variable is accessible ONLY inside the Money class
  private String country = "canada";

  // Public method
  // This method provides controlled access to the private variable
  public String getC() {
    return country;
  }
}

/*
 // Child class (COMMENTED OUT)
 class Yen extends Money {

     // This method tries to access 'country' directly using super.country
     public String getC() {
         return super.country; // ❌ COMPILE-TIME ERROR
     }
 }

 WHY ERROR?
 - 'country' is private in Money
 - Private members are NOT inherited
 - Child classes cannot access private variables directly
 - 'super' cannot access private members
 }
*/


public class Inheritance_Eg5 {

    /*
    // This method is COMMENTED OUT
    public String getC(int x) {
        return super.getC(); // ❌ COMPILE-TIME ERROR
    }

    WHY ERROR?
    - Inheritance_Eg5 does NOT extend Money
    - 'super' can be used ONLY inside a child class
    - Since there is no IS-A relationship, super.getC() is invalid
    */

  public static void main(String[] args) {

        /*
        System.out.println(new Yen().getC() + " " + new Inheritance_Eg5().getC());

        WHY THIS DOES NOT WORK?
        - Yen class is commented out
        - Even if Yen existed, direct access to private variable is not allowed
        - Inheritance_Eg5 does not have a getC() method
        */


  }
}
