/**
 * TP01Q04 - Alteração aleatória em Java
 * 
 * Nome: Enrico Menicucci Gomes
 * Matricula: 741176
 */

 import java.util.Random;

class TP01Q04{

//identifica se a linha lida é igual a "FIM"
public static boolean isFim(String s){
    return (s.length() == 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M');
}

//recebe uma string e troca um char por outro
public static String substituiChar(String s, char letra, char troca){
    String resultado = "";

    for (int i = 0; i < s.length(); i++){
        if (s.charAt(i) == letra){
            resultado += troca;
        }else {
            resultado += s.charAt(i);
        }
    }
    return resultado;
}

public static void main(String[] args) {
    String[] s = new String[1000];
    int numEntrada = 0;
    char letra1, letra2;

    Random gerador = new Random();
	gerador.setSeed(4);


    do {
        s[numEntrada] = MyIO.readLine();
    } while (isFim(s[numEntrada++]) == false);
    numEntrada--; //desconsidera a ultima linha com a palavra FIM


    //gera 2 caracteres aleatorios
    for (int i = 0; i < numEntrada; i++){
        letra1 = (char) ('a' + (Math.abs(gerador.nextInt() % 26)));
        letra2 = (char) ('a' + (Math.abs(gerador.nextInt() % 26)));

        MyIO.println(substituiChar(s[i], letra1, letra2));
    }

}

}