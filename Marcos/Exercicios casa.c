#include <stdio.h>

int main() {
    float salario;
    float imposto = 0;

    printf("Digite o salario bruto (R$): ");
    scanf("%f", &salario);

    if (salario <= 3036.00) {
        imposto = 0.0;
    } else if (salario <= 3533.31) {
        imposto = (salario * 0.075) - 182.16;
    } else if (salario <= 4688.85) {
        imposto = (salario * 0.15) - 394.16;
    } else if (salario <= 5830.85) {
        imposto = (salario * 0.225) - 675.49;
    } else {
        imposto = (salario * 0.275) - 908.73;
    }

    if (imposto < 0) imposto = 0;

    if (imposto == 0)
        printf("Isento de imposto de renda.\n");
    else
        printf("Imposto retido na fonte:\n", imposto);

    return 0;