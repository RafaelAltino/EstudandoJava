import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {
        String filename = "teste.txt";
        try (Scanner scanner = new Scanner(new File(filename))) {
            while (scanner.hasNext()){
                System.out.println(scanner.nextLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}