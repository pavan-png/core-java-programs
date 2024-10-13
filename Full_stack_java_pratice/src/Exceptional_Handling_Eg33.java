interface ILogger{
    void log();
}
public class Exceptional_Handling_Eg33 {
    public static void main(String[] args) {
        ILogger[] loggers = new ILogger[2];
        /*
        here we are creating an array of Ilogger interface type with size 2.
        since it is of object type and no data is assigned jvm will keep null
        loggers[0] = null;
        loggers[1] = null;
         */


        for (ILogger logger : loggers){
            logger.log();
        }
        /*
        on the loggers array we are trying to call log method
        so
        null.log()  would result in the NUllPointerException
         */

    }
}
