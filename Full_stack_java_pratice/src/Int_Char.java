public class Int_Char {
    public static void main(String[] args) {
        char c = 65535;
        // we cannot store number other than 65535, as there are only that many unicode characters, other than that range
        // if we try to store other whole numbers it results in the compile time error

        int a = '�'; // 65533 character.

    }
}
