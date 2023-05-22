
public class RansomNote {
    public static void main(String[] args) {
String magazine =
        "efjbdfbdgfjhhaiigfhbaejahgfbbgbjagbddfgdiaigdadhcfcj";
String ransomNote= "bg";
        System.out.println(canConstruct(ransomNote, magazine));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        int r = 0;
        StringBuilder mag = new StringBuilder(magazine);
        for (int i = 0; i < ransomNote.length(); i++) {
            for (int j = 0; j < mag.length(); j++) {
                if (ransomNote.charAt(i) == mag.charAt(j)) {
                    r++;
                    mag.setCharAt(j, '1');
                    break;
                }
            }
        }
        return r == ransomNote.length();
    }
}