import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TenthLine {

    public static void main(String[] args) throws IOException {
        try (FileReader fr = new FileReader("file.txt")) {
            Scanner sc = new Scanner(fr);
            while (sc.hasNext()) {
                for (int i = 0; i < 9; i++) {
                    sc.nextLine();
                }
                System.out.println(sc.nextLine());
            }
        }

    }
}
