

public class TP01Q13 {
    //método que identifica se a linha lida atende a condição de parada 
    public static boolean isFim(String s){
        return (s.length() == 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M');
    }


    public static String ciframentoRecursivo(String s, int i){
       String ciframento = "";

       if(i != s.length()){
            ciframento = ciframento + (char) (s.charAt(i) + 3) + ciframentoRecursivo(s, ++i);
       }
       return ciframento;
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
            MyIO.println(ciframentoRecursivo(s[i], 0));
        }
    }
}
