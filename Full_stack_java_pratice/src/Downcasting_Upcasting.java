class Royal_Enfield {

    // This method will be OVERRIDDEN in child classes
    void model() {
        System.out.println("Royal Enfield produces premium segment bikes");
    }

    void sales() {
        System.out.println("1. Classic 350  2. Bullet 350");
    }

    // OVERLOADED method (same name, different parameters)
    // This shows COMPILE-TIME POLYMORPHISM
    void sales(int year) {
        System.out.println("Sales data for year: " + year);
    }
}

class Classic350 extends Royal_Enfield {

    // OVERRIDDEN method
    // Runtime polymorphism happens here
    void model() {
        System.out.println("Classic 350 is a retro-style cruiser with a huge fan base");
    }

    // CHILD-SPECIFIC (SPECIALIZED) method
    // Not present in parent class
    void maintainence() {
        System.out.println("Classic 350 maintenance cost is low");
    }
}

class gt650 extends Royal_Enfield {

    // OVERRIDDEN method
    void model() {
        System.out.println("GT 650 is a cafe-racer with a huge fan base");
    }

    // CHILD-SPECIFIC (SPECIALIZED) method
    void maintainence() {
        System.out.println("GT 650 maintenance cost is low");
    }
}

public class Downcasting_Upcasting {

    public static void main(String[] args) {

        // ================= UPCASTING =================
        // Child object stored in parent reference
        Royal_Enfield obj = new Classic350();

        obj.sales();        // Parent method
        obj.sales(2025);    // OVERLOADED method → Compile-time polymorphism

        // OVERRIDDEN method call
        // Decided at runtime based on object type (Classic350)
        obj.model();        // Runtime polymorphism

        // ================= DOWNCASTING =================
        // Accessing CHILD-SPECIFIC (SPECIALIZED) method
        ((Classic350) obj).maintainence();


        // Another UPCASTING example
        Royal_Enfield obj1 = new gt650();
        obj1.model();       // Runtime polymorphism (gt650 version)

        // DOWNCASTING to access child-only method
        ((gt650) obj1).maintainence();
    }
}
