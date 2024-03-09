
public class String_Eg85 {
    public static void main(String[] args) {
        String str = " my\tfavourite\tbike\tis\thusquvarna\tsvartpilen\t250 ";
        //   "\t" will give tab space for each word.

        System.out.println(str.strip());
        // strip method removes empty spaces at the beginning and at the end ,
        // but not in between the string , similar to trim() .
    }
}
