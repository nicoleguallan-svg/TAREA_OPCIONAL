import java.io.FileWriter;

public class EscribirArchivos {

    public static void main(String[] args) throws Exception {

        FileWriter archivo=
        new FileWriter("datos.txt");

        archivo.write("Hola Mundo");

        archivo.close();

    }

}