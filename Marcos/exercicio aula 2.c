#include <stdio.h>
 
int main() {
    double preco, valor = 0;
 
    printf("Digite o valor do seu salário:\n");
    scanf("%lf", &preco);
 
    printf("preco = %.2lf\n", preco);
 
    if (preco <= 1518) {
        printf("Você vai pagar 7.5%% de impostos\n");
        valor = preco * 0.075;
        printf("Valor do Imposto: %.2lf\n", valor);
 
    } else if (preco <= 2793.88) {
        printf("Você vai pagar 9%% de impostos\n");
        valor = preco * 0.09;
        printf("Valor dos impostos é: %.2lf\n", valor);
 
    } else if (preco <= 4190.83) {
        printf("Você vai pagar 12%% de impostos\n");
        valor = preco * 0.12;
        printf("O valor dos impostos foi de: %.2lf\n", valor);
 
    } else if (preco < 8157.41) {
        printf("Você vai pagar 14%% de impostos\n");
        valor = preco * 0.14;
        printf("O valor dos impostos foi de: %.2lf\n", valor);
 
    } else {
        printf("Você só vai pagar o valor referente a 14%% de R$8157.41\n");
        valor = 8157.41 * 0.14;
        printf("O valor dos impostos foi de: %.2lf\n", valor);
    }
 
    return 0;
}