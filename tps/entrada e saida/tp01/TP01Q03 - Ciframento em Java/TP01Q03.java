/**
 * TP01Q03 - Ciframento em Java 
 * 
 * Nome: Enrico Menicucci Gomes
 * Matricula: 741176
 */

public class TP01Q03 {
    
    //método que identifica se a linha lida atende a condição de parada 
    public static boolean isFim(String s){
        return (s.length() == 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M');
    }
    //método que verifica se o character está com valores da tabela ascii e cifra o mesmo
    public static char encriptaChar(char charOriginal, int chave){
        char charCifrado;

        if (charOriginal >= 32 && charOriginal <= 254){
            charCifrado = (char) ((charOriginal - 32 + chave) + 32);
        }else {
            charCifrado = charOriginal;
        }
        return charCifrado;
    }

    //método que recebe a string e retorna a mesma cifrada
    public static String ciframentoCesar(int chave, String s){
        String textoCifrado = "";
        
        for (int i = 0; i < s.length(); i++){
            textoCifrado += encriptaChar(s.charAt(i), chave);
        }
        return textoCifrado;
    }

    public static void main(String[] args){
        String[] s = new String[1000];
        int numEntrada = 0;

        do {
            s[numEntrada] = MyIO.readLine();
        } while (isFim(s[numEntrada++]) == false);
        numEntrada--; //desconsidera a ultima linha com a palavra FIM

        //gera uma linha de saida para cada linha de entrada e faz o ciframento dos caracteres
        for (int i = 0; i < numEntrada; i++){
            MyIO.println(ciframentoCesar(3, s[i]));
        }
    }
}
