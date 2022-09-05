/**
 * TP01Q11 - Palindromo Recursivo em Java 
 * 
 * Nome: Enrico Menicucci Gomes
 * Matricula: 741176
 */

class TP01Q11 {
    //método que identifica se a linha lida atende a condição de parada 
    public static boolean isFim(String s){
        return (s.length() == 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M');
    }

    public static boolean isPalindromo(String s){
        boolean resp = true;

        if(s.length() == 0 || s.length() == 1){
            return resp;
        }

        if(s.charAt(0) == s.charAt(s.length() - 1)){
            return isPalindromo(s.substring(1, s.length() - 1));
        }
        resp = false;
        return resp;
    }

    public static void main(String[] args){
        String[] string = new String[1000];
        int numEntrada = 0;
        //faz a leitura de cada linha
        do {
            string[numEntrada] = MyIO.readLine();
        } while (isFim(string[numEntrada++]) == false);
        numEntrada--; //desconsidera a ultima linha com a palavra FIM
        //gera uma linha de saida para cada linha de entrada e verifica se o conteudo da entrada é palindromo
        for (int i = 0; i < numEntrada; i++){
            if(isPalindromo(string[i]) == true){
                MyIO.println("SIM");
            }else 
                MyIO.println("NAO");
        }
    }

}
