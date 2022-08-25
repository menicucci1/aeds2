
/**
 * TP01Q09 - Arquivo em Java
 * 
 * Nome: Enrico Menicucci Gomes
 * Matricula: 741176
 */
import java.io.*;

class TP01Q09 {
    public static void contaValoresReais(int quantidade) throws Exception {
        RandomAccessFile raf = new RandomAccessFile("teste.txt", "r");
        int inteiro;
        double real, temp;

        raf.seek(0);

        for (int i = quantidade; i > 0; i--) {
            raf.seek((9 * (i - 1)));
            temp = raf.readDouble();
            inteiro = (int) temp;
            raf.seek((9 * (i - 1)));
            real = raf.readDouble();

            if (inteiro == real) {
                System.out.println(inteiro);
                raf.seek((9 * (i - 1)) + 4);
            } else {
                System.out.println(real);
            }
            raf.readByte();
        }
        raf.close();
    }

    public static void main(String[] args) throws Exception {
        RandomAccessFile raf = new RandomAccessFile("teste.txt", "rw");
        int linhas = 0, temp = 0;
        double entrada = 0.00;

        linhas = MyIO.readInt();
        temp = linhas;
        while (temp != 0) {
            entrada = MyIO.readDouble();

            raf.writeDouble(entrada);
            raf.writeBytes("\n");
            temp--;
        }
        raf.close();

        contaValoresReais(linhas);
    }
}
