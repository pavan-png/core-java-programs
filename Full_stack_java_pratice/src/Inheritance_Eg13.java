class One{
    public One foo(){
        return this;
    }
}
class Two extends One  {
    public One foo(){
        return this;
    }
}
class Three extends Two{

  /*  public One foo() {
        return this;
    }
    here we can write both this methods can be written in the same class it is syntactically right
    , but methods with same name cannot be present in the same class.
   */
    public Two foo(){
        return this;
    }
}
public class Inheritance_Eg13 {
}
