import java.io.IOException;
import java.io.RandomAccessFile;

public class LeerLetras {

    public static void main(String[] args) throws IOException {

        final int TAM_CHAR = 2; // 2 byte de caracter

        long byteNum; // Numero de byte

        char ch; // Alojamos un carcater

        // Abrimos el archivo a leer
        RandomAccessFile randomFile = new RandomAccessFile("ejemplo.dat", "r");
        // Nos movemos al caracter número 5
        // desde el inicio del archivo.
        byteNum = TAM_CHAR * 5;
        randomFile.seek(byteNum);

        // Leemos el caracter y lo almacenamos
        // mostramos el caracter.
        ch = randomFile.readChar();
        System.out.println(ch);

       //lo mismo
        byteNum = TAM_CHAR * 10;
        randomFile.seek(byteNum);
        ch = randomFile.readChar();
        System.out.println(ch);

        //lo mismo
        byteNum = TAM_CHAR * 3;
        randomFile.seek(byteNum);
        ch = randomFile.readChar();
        System.out.println(ch);
        // Cerramos.
        randomFile.close();
    }
}
