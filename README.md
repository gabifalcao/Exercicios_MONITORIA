# Exercicios_MONITORIA
resposta dos exercicios da lista que eu passei para alunos que foram na monitoria

# Monitoria de Programação e Algoritmos - Lista de Exercícios
    AVISO: Desenvolva todos os programas dentro do método public static void main(String[] args). Utilize a classe Scanner para entrada de dados. Não é necessário criar classes adicionais ou métodos.

_# Nível 1: Fixação e Operações Básicas_
# Exercício 1: Calculadora de IMC Simplificada
Escreva um programa que leia o peso (em kg, como valor decimal) e a altura (em metros, como valor decimal) de uma pessoa. Calcule o IMC usando a fórmula IMC = peso / (altura * altura) e exiba o resultado.

# Exercício 2: Avaliação de Polinômio de 3º Grau
Escreva um programa que leia um valor decimal para a variável x. O programa deve calcular e exibir o valor resultante do seguinte polinômio de 3º grau:
y = 3*x^3 - 5*x^2 + 2*x - 7
Dica: Lembre-se da ordem de precedência dos operadores ou utilize Math.pow(x, n).

# Exercício 3: Relatório de Notas com Formatação de Strings
Escreva um programa que leia o nome do aluno (String), o nome da disciplina (String) e três notas decimais (double). Calcule a média aritmética e exiba o seguinte relatório formatado utilizando System.out.printf:========================================

RELATÓRIO ACADÊMICO

========================================

Aluno(a):    [Nome]

Disciplina:  [Disciplina]

Nota 1:      [Nota 1 com 2 casas decimais]

Nota 2:      [Nota 2 com 2 casas decimais]

Nota 3:      [Nota 3 com 2 casas decimais]

----------------------------------------

Média Final: [Média com 2 casas decimais]

========================================

# Exercício 4: Verificador de Par ou Ímpar
Escreva um programa que leia um número inteiro digitado pelo usuário e utilize o operador de resto (%) para determinar se o número é par ou ímpar. Exiba uma mensagem informando o resultado.

# Exercício 5: Múltiplos Entre Dois Números
Escreva um programa que leia dois números inteiros. O programa deve verificar se o primeiro número é múltiplo do segundo (ou seja, se a divisão do primeiro pelo segundo tem resto igual a zero) e exibir a mensagem correspondente.

_# Nível 2: Condicionais e Comparações (if / else)_
# Exercício 6: Maior e Menor entre Três Valores
Escreva um programa que receba três números inteiros e determine e exiba:

O maior número digitado.
O menor número digitado.
A média aritmética dos três números.

# Exercício 7: Verificação de Triângulo Válido
Leia três valores inteiros representando os lados de um triângulo (A, B e C). Um triângulo só é válido se a soma de dois lados for estritamente maior que o terceiro lado (A + B > C, A + C > B e B + C > A). Exiba se os lados formam ou não um triângulo válido.

# Exercício 8: Validação de Acesso a Empréstimo
Uma instituição financeira concede empréstimos bancários apenas se:

O valor da parcela foi menor ou igual a 30% do salário bruto do cliente.
O cliente tem pelo menos 18 anos.

Escreva um programa que leia o salário bruto, a idade do cliente e o valor da parcela desejada, informando se o empréstimo foi aprovado ou negado (e o motivo em caso de negação).
Exercício 9: Calculadora de Desconto Progressivo
Uma loja aplica descontos na compra de um produto dependendo da quantidade adquirida:

Até 5 unidades: sem desconto (0%).
De 6 a 10 unidades: 10% de desconto.
Acima de 10 unidades: 20% de desconto.

Escreva um programa que leia o preço unitário do produto e a quantidade comprada. O programa deve calcular e exibir o valor total bruto, o valor do desconto aplicado e o valor final a pagar.

_# Nível 3: Lógica Estruturada e switch_
# Exercício 10: Menu de Operações Matemáticas
Escreva um programa que leia dois números decimais (double) e apresente o seguinte menu no console:1 - Somar

2 - Subtrair

3 - Multiplicar

4 - Dividir

Utilize a estrutura switch para ler a opção do usuário e executar a operação desejada. Trate o caso de divisão por zero na opção 4.

# Exercício 11: Classificação do IMC
Aprimore o exercício 1. Após calcular o valor do IMC, classifique o resultado nas seguintes faixas usando if / else if:

IMC < 18.5: Abaixo do peso
18.5 <= IMC <= 24.9: Peso normal
25.0 <= IMC <= 29.9: Sobrepeso
IMC >= 30.0: Obesidade

# Exercício 12: Validador de Data Simples
Escreva um programa que receba o número de um mês (1 a 12) e um ano (ex: 2026). Utilizando switch, exiba quantos dias aquele mês possui (considere Fevereiro / mês 2 com 28 dias). Se for digitado um mês fora do intervalo 1-12, exiba uma mensagem de erro.
