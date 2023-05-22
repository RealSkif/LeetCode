import javax.sound.midi.Soundbank;

public class LengthofLastWord {

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));
    }

//    public static int lengthOfLastWord(String s) {
//        String[] str = s.split(" ");
//        return str[str.length - 1].trim().length();
//    }

    public static int lengthOfLastWord(String s) {
        return s.length() - (s.lastIndexOf(" ") + 1);
    }
}
