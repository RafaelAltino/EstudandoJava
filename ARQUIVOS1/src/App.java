import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class App {
    public static void main(String[] args) throws Exception {

        new File("arquivos").mkdir();





        System.out.println("vvvv");
        System.out.println(new File("./arquivos").getAbsolutePath());
        System.out.println("^^^^");

        
        // FileOutputStream fos = new FileOutputStream(new File("arquivos","teste.txt"));
        // fos.write(100);
        // fos.write(65);
        // fos.write(70);
        // fos.close();


        System.out.println("\n==========================");

        FileInputStream fis = new FileInputStream(
            new File("arquivos", "teste.txt")
        );


        // int a = fis.read();
        // System.out.println((char) a);

        int b;

        while((b = fis.read()) > 0){
            System.out.print((char) b);
        }
        fis.close();


    }
}
