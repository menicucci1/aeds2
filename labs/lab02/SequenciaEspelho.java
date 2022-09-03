import java.io.IOException;
import java.util.Scanner;

public class SequenciaEspelho {
 
    public static void sequenciaEspelho(int inicio, int fim){
        int aux;
        String str = "";

        for (int i = inicio; i <= fim; i++){
            System.out.print(i);
        }
        for (int i = fim; i >= inicio; i--){
            str = String.valueOf(i);
            aux = str.length();
            
            for (int j = aux; j > 0; j--){
                 System.out.print(str.charAt(j - 1));
            }
        }
        System.out.println();
    }

    public static void main(String[] args) throws IOException {
        int beginning, end, i = 0;
        String str = "";
        Scanner sc = new Scanner(System.in);
        
        
        while(sc.hasNext()){
            beginning = sc.nextInt();
            end = sc.nextInt();
            sequenciaEspelho(beginning, end);
        }
        sc.close();
    
 
    }
 
}