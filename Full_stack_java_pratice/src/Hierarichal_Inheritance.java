class theatre {
    void owner (){
        System.out.println("pavan owns a theatre");
    }
}
class House extends theatre{
    void home(){
        System.out.println("pavan owns a mansion house in the heart ");
    }
}
class Clg extends theatre{
    void collage(){
        System.out.println("pavan owns a enginnering and medical collage");
    }

}
public class Hierarichal_Inheritance {
    public static void main(String[] args) {
        Clg obj = new Clg();
        obj.collage();
        obj.owner();

        // since Clg class doesn't extend House class .
        // you cannot acess House methods , properties, blocks with Clg object.

    }
}
