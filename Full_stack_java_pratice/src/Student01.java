 class Student01 {
    private String st_Name ;
    private Integer st_Age;
    private Integer st_Id;
     public  Student01(String st_Name,Integer st_Age,Integer st_Id){
         this.st_Name = st_Name;
         this.st_Age = st_Age;
         this.st_Id = st_Id;
}
public void setSt_Name(String st_Name ){
    this.st_Name = st_Name;
}
public  String getSt_Name(){
    return st_Name;
}

public void setSt_Age(Integer st_Age){
    this.st_Age = st_Age;
}
public Integer getSt_Age(){
    return st_Age;
}

public void setSt_Id(Integer st_Id){
    this.st_Id = st_Id;
}
public Integer getSt_Id(){
    return st_Id;
}

     @Override
     public String toString() {
         return "Student01{" +
                 "st_Name='" + st_Name + '\'' +
                 ", st_Age=" + st_Age +
                 ", st_Id=" + st_Id +
                 '}';
     }
 }

