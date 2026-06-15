import java.io.File;
import java.util.Scanner;

public class LeerArchivo {

    public static void main(String[] args) throws Exception {

        Scanner lector=
        new Scanner(new File("datos.txt"));

        while(lector.hasNextLine()){

            System.out.println(
            lector.nextLine());

        }

        lector.close();

    }

}