/**
 * TP01Q02 - Palindromo em C 
 * 
 * Nome: Enrico Menicucci Gomes
 * Matricula: 741176
 */

#include <stdlib.h>
#include <stdio.h>
#include <string.h>
#include <stdbool.h>
//método que identifica se a linha lida atende a condição de parada 
bool isFim(char* s){
    return strlen(s) == 3 && s[0] == 'F' && s[1] == 'I' && s[2] == 'M';
}
//método que identifica se a palavra lida é a mesma de trás pra frente
bool isPalindromo(char* string){
    bool resp = true;
    int i;
    //varre a string e compara as posicoes dos characteres
    for (i = 0; i < strlen(string); i++){
        if (string[i] != string[strlen(string) - i - 1]){
            resp = false;
        }
    }

    return resp;
}

int main(void){
   char entrada[1000];
    //faz a leitura da entrada padrão
   while(isFim(entrada) == false) {

       scanf(" %[^\n]s", entrada);
        //verifica se o metódo é true ou false e printa o resultado
        if (isPalindromo(entrada) == true) {
            printf("SIM\n");
        }else if (isPalindromo(entrada) == false) {
            if (isFim(entrada) == true) {
                break;
            }
            else {
                printf("NAO\n");
            }
        }
        
    }

}
