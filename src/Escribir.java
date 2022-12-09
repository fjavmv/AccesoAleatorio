import java.io.IOException;
import java.io.RandomAccessFile;

public class Escribir {

    public static void main(String[] args) throws IOException {

        // Letras del afabeto
        char[] letras = {'a', 'b', 'c', 'd', 'e', 'f', 'g',
                'h', 'i', 'j', 'k', 'l', 'm', 'n','ñ',
                'o', 'p', 'q', 'r', 's', 't', 'u',
                'v', 'w', 'x', 'y', 'z'};

        System.out.println("Abriendo el archivo.");

        // Abrir un archivo para leer y escribir.
        RandomAccessFile randomFile = new RandomAccessFile("ejemplo.dat", "rw");

        System.out.println("Escribiendo información...");

        // Escritura secuencialmente la matriz de letras en el archivo.
        for (int i = 0; i < letras.length; i++)
            randomFile.writeChar(letras[i]);
        // Cerrando archivo.
        randomFile.close();
        System.out.println("Fin.");
    }
}
