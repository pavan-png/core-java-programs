class SubException extends Exception {

}
class SubSubException extends SubException {

}
public class Exceptionall_Handling_Eg14 {
    void doStuff() throws SubException {
    }
}


class CC2 extends Exceptionall_Handling_Eg14 {
    void doStuff() throws SubSubException {
    }
}

/*
class CC3 extends Exceptionall_Handling_Eg14 {

    void doStuff() throws Exception {
    }
}

 */

class CC4 extends Exceptionall_Handling_Eg14 {
    void doStuff(int x) throws Exception {
    }
}

class CC5 extends Exceptionall_Handling_Eg14 {
    void doStuff() {
    }
}


