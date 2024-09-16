# ContaBanco - Terminal Application

Este é um projeto simples em Java que simula a criação de uma conta bancária por meio de um terminal. O programa solicita ao usuário informações como número da conta, agência, nome do cliente e saldo inicial, e exibe os dados formatados no final. Futuramente, pretende-se implementar um sistema de autenticação com senha para proteger as informações.

## Funcionalidades

- Solicita o número da conta, agência, nome do cliente e saldo inicial.
- Exibe os dados da conta criada em formato amigável ao usuário.
- Utiliza `Scanner` para entrada de dados pelo terminal e `Locale` para garantir a formatação adequada de números.

## Como Executar

1. Certifique-se de que você tem o JDK (Java Development Kit) instalado.
2. Clone este repositório ou copie o código do arquivo `ContaTerminal.java`.
3. Compile o código:


```javac ContaTerminal.java```

## Execute o programa:

```java ContaTerminal```

## Siga as instruções no terminal para fornecer as informações da conta.

Exemplo de Uso:
Ao executar o programa, ele solicitará as seguintes informações:

Número da Conta
Número da Agência
Nome do Cliente
Saldo Inicial

Após fornecer essas informações, o programa exibirá uma mensagem semelhante a esta:

'Olá WARLEN, obrigado por criar uma conta em nosso banco.
Sua agência é 1234, conta 56789 e seu saldo 1500.75 já está disponível para saque.'

## Melhorias Futuras

Autenticação com senha: Planeja-se adicionar um sistema de autenticação onde o usuário precisará inserir a agência, número da conta e uma senha para acessar as informações da conta.

Validação de entrada: Implementar validação para garantir que os valores fornecidos para o saldo sejam numéricos e positivos.

## Requisitos
Java 8 ou superior
Terminal para entrada de dados

## Autor
Warlen
