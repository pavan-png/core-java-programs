enum Compass{
    NORTH,
    SOUTH,
    EAST,     // if there multiple constants they should be separated by ,  and the last one with ;
    WEST;
}
public class Enum_Inside_Outside_Class {
    public static void main(String[] args) {


        enum Day {
        MON , TUE , WED , THU , FRI , SAT;
        class ClassInsideEnum{

        }
        }

    }
}
