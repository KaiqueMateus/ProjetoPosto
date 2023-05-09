alcool = diesel = gasolina = gnv = totalc = totdie = totgas = totgnv = total = precoalc = precodie = precogas = precognv = somalit = somalitalc = somalitdie = somalitgas = somalitgnv = 0
resp = 'S'

class Valor:
    def calc_valor(self):
        return 0.0

class Alcool(Valor):
    def __init__(self, somalitalc, precoalc):
        self.somalitalc = somalitalc
        self.precoalc   = 5.69
    def calc_alc(self):
        return self.somalitalc * self.precoalc
    
class Diesel(Valor):
    def __init__(self,somalitdie, precodie):
        self.somalitdie = somalitdie
        self.precodie   = 2.96
    def calc_die(self):
        return self.somalitdie * self.precodie

class Gasolina(Valor):
    def __init__(self,somalitgas,precogas):
        self.somalitgas = somalitgas
        self.precogas   = 6.07
    def calc_gas(self):
        return self.somalitgas * self.precogas
    
class GNV(Valor):
    def __init__(self,somalitgnv, precognv):
        self.somalitgnv = somalitgnv
        self.precognv   = 4.15
    def calc_gnv(self):
        return self.somalitgnv * self.precognv
    
resp = str(input('Deseja abastecer (S/N):')).upper()
while resp == 'S':
    print('($)TABELA DE PREÇOS($):\n')
    print('1 - Álcool: R$5,69\n')
    print('2 - Diesel: R$2,96\n')
    print('3 - Gasolina: R$6,07\n')
    print('4 - GNV: R$4,15\n')
    combustivel = int(input('Escolha seu combustível:'))
    if combustivel in range(1, 5):
        litros = int(input('Quantos litros deseja abastecer?'))
        somalit = somalit + litros
    if combustivel == 1:
        somalitalc = somalitalc + litros
        totalc += 1
    elif combustivel == 2:
        somalitdie = somalitdie + litros
        totdie += 1
    elif combustivel == 3:
        somalitgas = somalitgas + litros
        totgas += 1
    elif combustivel == 4:
        somalitgnv = somalitgnv + litros
        totgnv += 1
    elif combustivel == 5:
        print('Abastecimento Completo!\n')
        break
    total+=1
resp = str(input('Tem outro cliente (S/N):')).upper()

print('\nAtendimento encerrado!\n')
print('='*23)
print('TOTAL DE CONSUMO HOJE')
print('='*23)
print(f'\nQuantidade de Litros consumido foi: {somalit} litros\n')
print(f'Quantidade de Álcool consumido foi: {somalitalc} litros\n')
print(f'Quantidade de Diesel consumido foi: {somalitdie} litros\n')
print(f'Quantidade de Gasolina consumida foi: {somalitgas} litros\n')
print(f'Quantidade de GNV consumido foi: {somalitgnv} litros\n')
print('='*33)
print('VALOR ARRECADADO POR COMBUSTÍVEL')
print('='*33)
alcool = Alcool(somalitalc,precoalc).calc_alc()
print(f'\nValor arrecado de compras de Álcool: R${alcool:.2f}\n')
diesel = Diesel(somalitdie,precodie).calc_die()
print(f'Valor arrecado de compras de Diesel: R${diesel:.2f}\n')
gasolina = Gasolina(somalitgas,precogas).calc_gas()
print(f'Valor arrecado de compras de Gasolina: R${gasolina:.2f}\n')
gnv = GNV(somalitgnv,precognv).calc_gnv()
print(f'Valor arrecado de compras de GNV: R${gnv:.2f}\n')
print('='*33)
print('TOTAL DE CLIENTES POR COMBUSTÍVEL')
print('='*33)
print(f'\nQuantidade de carros abastecidos:{total}\n')
print(f'Álcool = {totalc} clientes\n')
print(f'Diesel = {totdie} clientes\n')
print(f'Gasolina = {totgas} clientes\n')
print(f'GNV = {totgnv} clientes\n')

