/**
 * TP01Q05 - Álgebra Booleana em Java
 * 
 * Nome: Enrico Menicucci Gomes
 * Matricula: 741176
 */

class TP01Q06 {

    //recebe uma string e verifica se a linha lida é igual a "FIM"
    public static boolean isFim(String s){
        return (s.length() == 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M');
    }

    //recebe uma string e verifica se é formada apenas por vogais
    public static boolean isVogal(String s){
        boolean resp = true;
        for(int i = 0; i < s.length(); i++){
            if((s.charAt(i) != 'a') && (s.charAt(i) != 'e') && (s.charAt(i) != 'i') && (s.charAt(i) != 'o') && (s.charAt(i) != 'u') && 
                (s.charAt(i) != 'A') && (s.charAt(i) != 'E') && (s.charAt(i) != 'I') && (s.charAt(i) != 'O') && (s.charAt(i) != 'U')){
                resp = false;
            }
        }

        return resp;

    }

    //recebe uma string e verifica se é formada apenas por consoantes
    public static boolean isConsoante(String s){
        boolean resp = true;

        for(int i = 0; i < s.length(); i++){
            if((s.charAt(i) == 'a') && (s.charAt(i) == 'e') && (s.charAt(i) == 'i') && (s.charAt(i) == 'o') && (s.charAt(i) == 'u') && 
                (s.charAt(i) == 'A') && (s.charAt(i) == 'E') && (s.charAt(i) == 'I') && (s.charAt(i) == 'O') && (s.charAt(i) == 'U') || 
                (s.charAt(i) < 65 || s.charAt(i) > 90) && (s.charAt(i) < 97 || (s.charAt(i) < 122))){
                    resp = false;
            }  
        }

        return resp;

    }

    //recebe uma string e verifica se é composta por um numero inteiro
    public static boolean isInteiro(String s){
        boolean resp = true;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) < 48 || s.charAt(i) > 57){
                resp = false;
            }
        }

        return resp;

    }

    //recebe uma string e verifica se é composta por um numero real
    public static boolean isReal(String s){
        int contaVirgula = 0, contaChar = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 44 || s.charAt(i) == 46){
                contaVirgula++;
            }
            if(s.charAt(i) >= 48 && s.charAt(i) <= 57){
                contaChar++;
            }
            if((contaVirgula == 0 || contaVirgula == 1) && contaChar == s.length() - contaVirgula){
                return true;
            }
            
        }
        return false;
    } 
    
    public static void main(String[] args) {
        String[] s = new String[1000];
        int numEntrada = 0;
        String resposta = "", resultado = "";
        
        //lendo as entradas
        do {
            s[numEntrada] = MyIO.readLine();
        } while (isFim(s[numEntrada++]) == false);
        numEntrada--; //desconsidera a ultima linha com a palavra FIM

        for(int i = 0; i < numEntrada; i++){
            resultado = "";

            if(isVogal(s[i]) == true){
                resposta = "SIM";
                resultado += resposta + " "; 
            }else{
                resposta = "NAO";
                resultado += resposta + " ";
            }if(isConsoante(s[i]) == true){
                resposta = "SIM";
                resultado += resposta + " "; 
            }else{
                resposta = "NAO";
                resultado += resposta + " ";
            }if(isInteiro(s[i]) == true){
                resposta = "SIM";
                resultado += resposta + " "; 
            }else{
                resposta = "NAO";
                resultado += resposta + " ";
            }if(isReal(s[i]) == true){
                resposta = "SIM";
                resultado += resposta + " "; 
            }else{
                resposta = "NAO";
                resultado += resposta;
            }

            MyIO.println(resultado);

        }

    }
}
