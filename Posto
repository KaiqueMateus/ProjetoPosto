#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

float calc_alc(float somalitalc) {
    return somalitalc * 5.69;
}
float calc_die(float somalitdie) {
    return somalitdie * 2.96;
}
float calc_gas(float somalitgas) {
    return somalitgas * 6.07;
}
float calc_gnv(float somalitgnv) {
    return somalitgnv * 4.15;
}
int main(int argc, char *argv[]) {
    setlocale(LC_ALL, "Portuguese");
    float alcool,diesel,gasolina,gnv,precoalc,precodie,precogas,precognv;
    int combustivel, litros, total, somalit, somalitalc,somalitdie,somalitgas,somalitgnv, totalc ,totdie,totgas,totgnv;
    char resp = 'S';
    
    printf("Deseja Abastecer? (S/N): ");
    scanf("%c",&resp);
    resp=toupper(resp);
    while (resp == 'S') {
        printf("($)TABELA DE PREÇOS($):\n");
        printf("1 - Álcool:R$5,69\n");
        printf("2 - Diesel:R$2,96\n");
        printf("3 - Gasolina:R$6,07\n");
        printf("4 - GNV:R$4,15\n");
        printf("5 - PARA ENCERRAR!\n");
        printf("Escolha seu Combustível:");
        scanf("%d",&combustivel);
         switch (combustivel) {
            case 1 : combustivel = 1;
                     printf("Quantos Litros deseja abastecer?");
                     scanf("%d",&litros);
                     totalc += 1;
                     somalitalc = somalitalc + litros;
            break;
            case 2 : combustivel = 2;
                     printf("Quantos Litros deseja abastecer?");
                     scanf("%d",&litros);
                     totdie += 1;
                     diesel = somalit;
            break;
            case 3 : combustivel = 3;
                     printf("Quantos Litros deseja abastecer?");
                     scanf("%d",&litros);
                     totgas += 1;
                     diesel = somalit;
            break;
            case 4 : combustivel = 4;
                     printf("Quantos Litros deseja abastecer?");
                     scanf("%d",&litros);
                     totgnv += 1;
                     diesel = somalit;
            break;
            case 5 : combustivel = 5;
                     printf("Tem outro Cliente (S/N):");
                     scanf("%c",&resp); 
            break;
            default :
                     printf("Atendimento Completo!");
        }
     somalit = somalit + litros;
     total++;
    }
  printf("\n----TOTAL DE CONSUMO HOJE!----\n");
  printf("Quantidade de Álcool consumido foi: %d litros\n", somalitalc);
  printf("Quantidade de Diesel consumido foi: %d litros\n", somalitdie);
  printf("Quantidade de Gasonlina consumido foi: %d litros\n", somalitgas);
  printf("Quantidade de GNV consumido foi: %d litros\n", somalitgnv);
  printf("\n----VALOR ARRECADADO POR COMBUSTÍVEL----\n");
  alcool   = calc_alc(somalitalc);
  printf("Valor arrecadado de Álcool: R$ %.2f\n", alcool);
  diesel   = calc_die(somalitdie);
  printf("Valor arrecadado de Diesel: R$ %.2f\n", diesel);
  gasolina = calc_gas(somalitgas);
  printf("Valor arrecadado de Gasonlina: R$ %.2f\n", gasolina);
  gnv      = calc_gnv(somalitgnv);
  printf("Valor arrecadado de GNV: R$ %.2f\n", gnv);
  printf("\n----TOTAL DE CLIENTES POR COMBUSTÍVEL----\n");
  printf("Quantidade de Veículos abastecidos: %d\n", total);
  printf("Álcool: %d\n", totalc);
  printf("Diesel: %d\n", totdie);
  printf("Gasolina: %d\n", totgas);
  printf("GNV: %d\n", totgnv);
  system("Pause");
  return 0;
}
