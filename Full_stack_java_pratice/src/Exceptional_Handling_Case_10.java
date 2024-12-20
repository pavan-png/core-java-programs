/*
if an exception occured at statement - 8 and corresponding catch block is not  matched.
 */

public class Exceptional_Handling_Case_10 {
    public static void main(String[] args) {
        try { // outer try
            System.out.println("statement -1");
            System.out.println("statement -2");
            System.out.println("statement -3");
            try {  // inner try -1
                System.out.println("statement - 4");
                System.out.println("statement - 5"+ 5/0); // exception encountered in statement -5 inner try-1 , so statement - 5 is executed but will not print due to exception arise
                System.out.println("statement - 6");

            }
            catch (ArithmeticException ae){  // if this inner catch -1  has to work inner try -1 should encounter an exception
                System.out.println("statement - 7");
                try { // inner try -2
                    System.out.println("statement - 8 " + 6/0); // again exception occured in statement -8  inner try -2 ,  so statement - 8 is executed but will not print due to exception arise
                    System.out.println("statement - 9 ");
                    System.out.println("statement - 10 ");
                }
                catch (NegativeArraySizeException ne){ // inner catch -2 will not execute since it is not corresponding exception to handle
                    System.out.println("statement - 11");
                }
            }
            finally {
                System.out.println("statement - 12");
            }
            System.out.println("statement - 13");
        }
        catch (Exception e){ // outer catch
            System.out.println("statement - 14"); //  exception in  inner try2 is not handled. outer catch will  execute
        }
        finally {
            System.out.println("statement - 15");
        }
        System.out.println("statement - 16");
    }
}
