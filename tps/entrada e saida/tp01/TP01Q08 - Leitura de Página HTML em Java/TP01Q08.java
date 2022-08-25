
/**
 * TP01Q08 - Leitura pagina HTML
 * 
 * Nome: Enrico Menicucci Gomes
 * Matricula: 741176
 */
import java.io.*;
import java.net.*;

class TP01Q08 {

    public static String getHtml(String endereco) {
        URL url;
        InputStream is = null;
        BufferedReader br;
        String resp = "", line;

        try {
            url = new URL(endereco);
            is = url.openStream();
            br = new BufferedReader(new InputStreamReader(is));

            while ((line = br.readLine()) != null) {
                resp += line + "\n";
            }
        } catch (MalformedURLException mue) {
            mue.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        try {
            is.close();
        } catch (IOException ioe) {

        }

        return resp;
    }

    public static boolean isBr(String s) {
        String br = "<br>";
        for (int i = 0; i < br.length(); i++) {
            if (s.charAt(i) != br.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isTable(String s) {
        String table = "<table>";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != table.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    // recebe uma string e verifica se a linha lida é igual a "FIM"
    public static boolean isFim(String s) {
        return (s.length() == 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M');
    }

    public static String leituraPagina(String endereco, String nomePagina) {
        String conteudoPagina = "", tagHtml = "", resp = "";

        int contadorA = 0, contadorE = 0, contadorI = 0, contadorO = 0, contadorU = 0;
        int contadorA1 = 0, contadorE1 = 0, contadorI1 = 0, contadorO1 = 0, contadorU1 = 0;
        int contadorA2 = 0, contadorE2 = 0, contadorI2 = 0, contadorO2 = 0, contadorU2 = 0;
        int contadorA3 = 0, contadorE3 = 0, contadorI3 = 0, contadorO3 = 0, contadorU3 = 0;
        int contadorAtil = 0, contadorOtil = 0, contadorConsoante = 0, contadorBr = 0, contadorTable = 0;
        char c = ' ';

        conteudoPagina = getHtml(endereco);

        for (int i = 0; i < conteudoPagina.length(); i++) {
            tagHtml = "";
            c = conteudoPagina.charAt(i);

            if (c == 97) {
                contadorA++;
            }
            if (c == 101) {
                contadorE++;
            }
            if (c == 105) {
                contadorI++;
            }
            if (c == 111) {
                contadorO++;
            }
            if (c == 117) {
                contadorU++;
            }
            // áéíóú
            if (c == 225) {
                contadorA1++;
            }
            if (c == 233) {
                contadorE1++;
            }
            if (c == 237) {
                contadorI1++;
            }
            if (c == 243) {
                contadorO1++;
            }
            if (c == 250) {
                contadorU1++;
            }
            // àèìòù}
            if (c == 224) {
                contadorA2++;
            }
            if (c == 232) {
                contadorE2++;
            }
            if (c == 236) {
                contadorI2++;
            }
            if (c == 242) {
                contadorO2++;
            }
            if (c == 249) {
                contadorU2++;
            }
            // âêîôû
            if (c == 226) {
                contadorA3++;
            }
            if (c == 234) {
                contadorE3++;
            }
            if (c == 238) {
                contadorI3++;
            }
            if (c == 244) {
                contadorO3++;
            }
            if (c == 251) {
                contadorU3++;
            }
            // ã õ
            if (c == 227) {
                contadorAtil++;
            }
            if (c == 245) {
                contadorOtil++;
            }
            // consoante
            if ((c > 97 && c <= 122) && (c != 65 && c != 97) && (c != 69 && c != 101) && (c != 73 && c != 105)
                    && (c != 79 && c != 111) && (c != 85 && c != 117)) {
                contadorConsoante++;
            }
            if (c == 60) {
                for (int j = 0; j < 7; j++) {
                    c += conteudoPagina.charAt(i + j);
                }
                if (isTable(tagHtml) == true) {
                    contadorTable++;
                    i += 7;
                } else if (isBr(tagHtml)) {
                    contadorBr++;
                    i += 4;
                }
            }
        }
        resp = "a(" + contadorA + ") e(" + contadorE + ") i(" + contadorI + ") o(" + contadorO + ") u(" + contadorU
                + ") á(" + contadorA1 + ") é(" + contadorE1 + ") í(" + contadorI1 + ") ó(" + contadorO1 + ") ú("
                + contadorU1 + ") à(" + contadorA2 + ") è(" + contadorE2 + ") ì(" + contadorI2 +
                ") ò(" + contadorO2 + ") ù(" + contadorU2 + ") ã(" + contadorAtil + ") õ(" + contadorOtil + ") â("
                + contadorA3 + ") ê(" + contadorE3 + ") î(" + contadorI3 + ") ô(" + contadorO3 + ") û(" + contadorU3
                + ") consoante(" + contadorConsoante + ") <br>(" + contadorBr + ") <table>(" +
                contadorTable + ") " + nomePagina;
        return resp;
    }

    public static void main(String[] args) {
        String endereco, html;
        endereco = "http://maratona.crc.pucminas.br/series/Friends.html";
        html = getHtml(endereco);

        String[] address = new String[1000];
        String[] nome = new String[1000];
        int numEntrada = 0;

        do {
            nome[numEntrada] = MyIO.readLine();
            if (!(isFim(nome[numEntrada]))) {
                address[numEntrada] = MyIO.readLine();
            }
        }while (!(isFim(nome[numEntrada++])));
        numEntrada--;

        for (int i = 0; i < numEntrada; i++) {
            MyIO.println(leituraPagina(address[i], nome[i]));
        }

    }
}
