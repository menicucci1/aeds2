#include <stdio.h>

int main(void){
    int n = 0;
    double num = 0.0;
    FILE *file = fopen("teste.txt", "w");

    scanf("%d", &n);
    //  escrever N numeros no arquivo
    for (int i = 0; i < n; i++){
        scanf("%lf", &num);
        fwrite(&num, sizeof(num), 1, file);
    }
    fclose(file);
    // abrir arquivo e ler N numeros de tras pra frente
    FILE *entrada = fopen("teste.txt", "r");
    for (int i = 1; i <= n; i++){
        fseek(entrada, -i * 8, SEEK_END);
        fread(&num, sizeof(double), 1, entrada);
        if (num - (int)num == 0){
            printf("%d\n", (int)num);
        }
        else{
            printf("%g\n", num);
        }
    }
    fclose(entrada);
}