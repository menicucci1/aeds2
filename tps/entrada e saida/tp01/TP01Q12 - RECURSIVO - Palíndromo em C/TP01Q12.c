/**
 * TP01Q12 - Palindromo Recursivo em C
 *
 * Nome: Enrico Menicucci Gomes
 * Matricula: 741176
 */

#include <stdlib.h>
#include <stdio.h>
#include <stdbool.h>
#include <string.h>

int isFim(char *c)
{
    return strlen(c) == 3 && c[0] == 'F' && c[1] == 'I' && c[2] == 'M';
}

bool isPalindromoRecursivo(char str[], int inicio, int fim){
    if (inicio == fim){
        return true;
    }

    if (str[inicio] != str[fim]){
        return false;
    }

    if (inicio < fim + 1){
        return isPalindromoRecursivo(str, inicio + 1, fim - 1);
    }
    return true;
}

bool isPalindromo(char s[]){
    int n = strlen(s);

    if (n == 0){
        return true;
    }
    return isPalindromoRecursivo(s, 0, n - 1);
}

int main(void){
    char entrada[1000];
    // faz a leitura da entrada padrão
    while (isFim(entrada) == false){
        scanf(" %[^\n]s", entrada);
        // verifica se o metódo é true ou false e printa o resultado
        if (isPalindromo(entrada)){
            printf("SIM\n");
        }
        else if (!(isPalindromo(entrada))){
            if (isFim(entrada) == true){
                break;
            }else{
                printf("NAO\n");
            }
        }
    }
}