/**
 * TP01Q01 - Palindromo em Java 
 * 
 * Nome: Enrico Menicucci Gomes
 * Matricula: 741176
 */

public class TP01Q01 {

    //método que identifica se a linha lida atende a condição de parada 
    public static boolean isFim(String s){
        return (s.length() == 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M');
    }

    //método que identifica se a palavra lida é a mesma de trás pra frente
    public static boolean isPalindromo(String str){
        boolean resp;
        String palavraContraria = "";
        
        for (int i = (str.length() - 1); i >= 0; i--){ //varre a palavra e armazena os caracteres de tras pra frente
            palavraContraria += str.charAt(i);
        }
        
        if (palavraContraria.equals(str)) {
            resp = true;
        } else {
            resp = false;
        }
        return resp;
    }
    
    public static void main(String[] args) {
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