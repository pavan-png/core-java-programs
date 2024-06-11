interface IDemo{
    void a1();
}
interface JDemo{
    void a1(int i);
}
class IDemoImpl implements IDemo,JDemo{
    @Override
    public void a1(){

    }
    @Override
    public void a1(int i){

    }
}
public class Two_Interface_With_Same_Name_Different_Parameter {
    public static void main(String[] args) {

    }
}
