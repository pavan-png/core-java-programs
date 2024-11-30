public class String_Eg23 {
    public static void main(String[] args) {
        String s = "Hello woooooooooorld";
        // gives index of the character
        System.out.println(s.indexOf('w'));

        //when indexOf() method returns the  first occurance .
        System.out.println(s.indexOf('o')); // index starts from 0.

        // if the character is not found it gives -1
        System.out.println(s.indexOf('y'));

        //gives the last occurance of the character
        System.out.println(s.lastIndexOf('o'));

        //if the character is  not found it gives -1
        System.out.println(s.lastIndexOf('z'));

    }
}
