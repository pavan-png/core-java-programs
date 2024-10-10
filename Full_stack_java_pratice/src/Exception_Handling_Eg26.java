import java.io.FileNotFoundException;

public class Exception_Handling_Eg26 {
    public static void main(String[] args) {
        try {
            System.out.println(1);
        }
        catch (NullPointerException e){
            System.out.println("One");
        }

        /*
        catch (FileNotFoundException e1){   // checked exception
            System.out.println("Two");

           when the exception is not generated compiler will check whether the catch block consists of
          any checked exception
           if you are writing a catch block w.r.t checked exception , then compulsorily the compiler will
           check whether the try block has associated checked exception

           since there is no associated code in try block w.r.t checked exception it leads to C.E
















        }

         */
        System.out.println("Three");
    }
}
