
interface InterfaceX
{
    public void geek();
}
interface InterfaceY
{
    public void geek(int x);
}
class Testing implements InterfaceX, InterfaceY
{
    @Override
    public void geek()
    {
        System.out.println("hello");
    }

    @Override
    public void geek(int x) {

    }
}

public class Interface_Methods_With_Same_Name_Different_Parameterd
{
    public static void main(String[] args) {
        Testing obj = new Testing();
        obj.geek();
    }
}

