
interface InterfaceX
{
    public void geek();
}
interface InterfaceY
{
    public void geek();
}
class Testing implements InterfaceX, InterfaceY
{
    public void geek()
    {
        System.out.println("hello");
    }
}

public class Interface_Methods_With_Same_Signature_Return_Type
{
    public static void main(String[] args) {
        Testing obj = new Testing();
        obj.geek();
    }
}

