interface ILogger {

    // Step 1:
    // Interface method declaration.
    // Any implementing class must define log().
    void log();
}

public class Exceptional_Handling_Eg31 {

    public static void main(String[] args) {

        /*
         Step 2:
         Creating an array of ILogger type with size 2.

         Since ILogger is an interface (reference type),
         the array will store references.

         By default, all elements of object arrays
         are initialized to null.

         So internally:

             loggers[0] = null;
             loggers[1] = null;
        */
        ILogger[] loggers = new ILogger[2];

        /*
         Step 3:
         Enhanced for loop iterates over array elements.

         First iteration:
             logger = loggers[0] → null

         Second iteration:
             logger = loggers[1] → null
        */
        for (ILogger logger : loggers) {

            /*
             Step 4:
             Calling method on logger.

             But logger is null.

             So this becomes:
                 null.log();

             Calling any method on null reference
             causes NullPointerException.
            */
            logger.log();
        }

        /*
         Step 5:
         Program terminates at first iteration itself
         due to NullPointerException.

         So second iteration never happens.
        */
    }
}