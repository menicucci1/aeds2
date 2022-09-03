#include <stdio.h>
#include <string.h>

int main(){
    int length, length1, length2;
    char string1[100], string2[100];

    scanf("%s %s", string1, string2);
    length1 = strlen(string1);
    length2 = strlen(string2);
    if (length1 >= length2){
        length = length1;
    }else{
        length = length2;
    }
    for (int i = 0; i < length; i++){
        if(i < length1){
            printf("%c", string1[i]);
        }
        if(i < length2){
            printf("%c", string2[i]);
        }
    }
    printf("\n");
    return 0;
}