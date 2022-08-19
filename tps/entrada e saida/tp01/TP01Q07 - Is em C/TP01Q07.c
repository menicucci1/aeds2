#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <stdbool.h>

int isFim(char s[]){
    return (strlen(s) == 3 && s[0] == 'F' && s[1] == 'I' && s[2] == 'M');
}

const char* isVogal(char s[]){
    bool resp = true;
        for(int i = 0; i < strlen(s); i++){
            if((s[i] != 'a') && (s[i] != 'e') && (s[i] != 'i') && (s[i] != 'o') && (s[i] != 'u') && 
                (s[i] != 'A') && (s[i] != 'E') && (s[i] != 'I') && (s[i] != 'O') && (s[i] != 'U')){
                return "NAO";
            }
        }

    return "SIM";
}

const char* isConsoante(char s[]){

        for(int i = 0; i < strlen(s); i++){
            if((s[i] == 'a') && (s[i] == 'e') && (s[i] == 'i') && (s[i] == 'o') && (s[i] == 'u') && 
                (s[i] == 'A') && (s[i] == 'E') && (s[i] == 'I') && (s[i] == 'O') && (s[i] == 'U') || 
                (s[i] < 65 || s[i] > 90) && (s[i] < 97 || (s[i] < 122))){
                    return "NAO";
            }  
        }

        return "SIM";
}

const char* isInteiro(char s[]){

        for(int i = 0; i < strlen(s); i++){
            if(s[i] < 48 || s[i] > 57){
                return "NAO";
            }
        }

        return "SIM";
}

const char* isReal(char s[]){
    int contaVirgula = 0, contaChar = 0;
        for(int i = 0; i < strlen(s); i++){
            if(s[i] == 44 || s[i] == 46){
                contaVirgula++;
            }
            if(s[i] >= 48 && s[i] <= 57){
                contaChar++;
            }
            if((contaVirgula == 0 || contaVirgula == 1) && contaChar == strlen(s) - contaVirgula){
                return "SIM";
            }
            
        }
        return "NAO";
}

int main(void){
    char s[1000];

    scanf("%[^\n]", s);
	getchar();

    while((isFim(s)) == false){
        printf("%s %s %s %s\n", isVogal(s), isConsoante(s), isInteiro(s), isReal(s));
        scanf("%[^\n]", s);
        getchar();
        
    }
    return 0;
}
