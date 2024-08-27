class Payload{ // encapsulated class
    private int weight;
    public Payload(int w){
        weight = w;
    }
    public void setWeight(int w){
        weight =w;
    }
    public String toString(){  // toString() will act as a getter
        return Integer.toString(weight);
    }
}
public class Static_Method_Eg2 {
    static void changePayload(Payload p){
        p.setWeight(420);/*
        inside a static method using a reference we call make a call to instance method
        */
    }
    public static void main(String[] args) {
        Payload p = new Payload(200); // weight = 200
        p.setWeight(1024); // weight = 1024
        changePayload(p); // this object is given to changePayLoad
        System.out.println("p is "+p);
    }
}
