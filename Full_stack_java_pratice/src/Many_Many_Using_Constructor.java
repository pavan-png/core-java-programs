public class Many_Many_Using_Constructor {
    public static void main(String[] args) {
        Course courses_01 = new Course("java","#01","10k");
        Course courses_02 = new Course("python","#02","7.5k");
        Course courses_03 = new Course("sql","#03","5k");

        Course[] courses1 = new Course[3];
        courses1[0] = courses_01;
        courses1[1] = courses_02;
        courses1[2] = courses_03;

        Student_03 s1 = new Student_03("pavan","Hp5A1","123-A",courses1);
        Student_03 s2 = new Student_03("Anand","Hp592","123-B",courses1);
        Student_03 s3 = new Student_03("charan","Hp595","123-c",courses1);

        s1.get_Details();
        s2.get_Details();
        s3.get_Details();



    }
}
