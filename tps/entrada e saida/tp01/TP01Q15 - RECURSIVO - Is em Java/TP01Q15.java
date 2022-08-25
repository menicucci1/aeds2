/**
 * TP01Q15 - Is Recursivo em Java
 * 
 * Nome: Enrico Menicucci Gomes
 * Matricula: 741176
 */

public class TP01Q15 {
    // recebe uma string e verifica se a linha lida é igual a "FIM"
    public static boolean isFim(String s) {
        return (s.length() == 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M');
    }

    // recebe uma string e verifica se é formada apenas por vogais
    public static String isVogal(String s, int i) {
        String resp;
        if (i == s.length()) {
            resp = "SIM";
        } else if ((s.charAt(i) != 'a') && (s.charAt(i) != 'e') && (s.charAt(i) != 'i') && (s.charAt(i) != 'o')
                && (s.charAt(i) != 'u') &&
                (s.charAt(i) != 'A') && (s.charAt(i) != 'E') && (s.charAt(i) != 'I') && (s.charAt(i) != 'O')
                && (s.charAt(i) != 'U')) {
            resp = "NAO";
        } else {
            resp = isVogal(s, ++i);
        }
        return resp;

    }
    //verifica se a string inteira é formada por consoantes
    public static String isConsoante(String s, int i) {
        String resp;
        if (i == s.length()) {
            resp = "SIM";
        } else if ((s.charAt(i) == 'a') && (s.charAt(i) == 'e') && (s.charAt(i) == 'i') && (s.charAt(i) == 'o')
                && (s.charAt(i) == 'u') && (s.charAt(i) == 'A') && (s.charAt(i) == 'E') && (s.charAt(i) == 'I')
                && (s.charAt(i) == 'O') && (s.charAt(i) == 'U')
                || (s.charAt(i) < 65 || s.charAt(i) > 90) && (s.charAt(i) < 97 || (s.charAt(i) < 122))) {
            resp = "NAO";
        } else {
            resp = isConsoante(s, ++i);
        }

        return resp;
    }
    //verifica se a string é um numero inteiro
    public static String isInteiro(String s, int i) {
        String resp;

        if (i == s.length()) {
            resp = "SIM";
        } else if (s.charAt(i) < 48 || s.charAt(i) > 57) {
            resp = "NAO";
        } else {
            resp = isInteiro(s, ++i);
        }

        return resp;

    }
    //verifica se a string é um numero real
    public static String isReal(String s, int i, int contador) {
        String resp;

        if (i == s.length()) {
            resp = "SIM";
        } else if ((contador > 1)
                || ((s.charAt(i) != ',' && s.charAt(i) != '.') && (s.charAt(i) < '0') || (s.charAt(i) > '9'))) {
            resp = "NAO";
        } else {
            if (s.charAt(i) == ',' || s.charAt(i) == '.') {
                contador++;
            }
            resp = isReal(s, ++i, contador);
        }

        return resp;
    }

    public static void main(String[] args){
        String s = MyIO.readLine();

        while(isFim(s) == false){
            MyIO.print(isVogal(s, 0) + " ");
            MyIO.print(isConsoante(s, 0) + " ");
            MyIO.print(isInteiro(s, 0) + " ");
            MyIO.print(isReal(s, 0, 0) + "\n");
            s = MyIO.readLine();
        }
    }
}
