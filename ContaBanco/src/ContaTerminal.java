import java.util.Locale;
import java.util.Scanner;

/**
 * Classe principal do programa ContaBanco, que solicita informações
 * ao usuário e exibe os dados da conta criada.
 * 
 * @author Warlen
 */

/**
 * FUTURA MELHORIA: Implementar sistema de autenticação com senha.
 * O próximo passo é adicionar uma funcionalidade de segurança, onde o usuário precisará
 * inserir a agência, número da conta e uma senha para acessar as informações da conta.
 * Após a autenticação, as demais informações, como saldo e nome do cliente, serão exibidas
 * apenas se a validação da senha for bem-sucedida. A senha será solicitada junto com a
 * agência e o número da conta para garantir a privacidade dos dados.
 */

public class ContaTerminal {

    /**
     * Método principal que será executado para iniciar o programa.
     * Este método solicita as informações de uma conta bancária via terminal.
     * 
     * @param args argumentos de linha de comando não foram utilizados neste programa.
     */
    public static void main(String[] args) {
        // Instancia o objeto Scanner para receber dados do terminal
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);  // Define o Locale para o formato de números dos EUA, ou seja, com ponto '.'

        // Solicita e armazena o número da conta
        System.out.println("Por favor, digite o número da Conta:");
        int numeroConta = scanner.nextInt(); // Lê o número da conta (inteiro)

        // Solicita e armazena o número da agência
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.next(); // Lê o número da agência (texto)

        // Limpa a linha pendente no buffer após ler o número da conta
        scanner.nextLine();

        // Solicita e armazena o nome do cliente
        System.out.println("Por favor, digite o seu nome:");
        String nomeCliente = scanner.nextLine().toUpperCase(); // Lê o nome completo do cliente e converte para maiúsculas

        // Solicita e armazena o saldo da conta
        System.out.println("Por favor, digite o saldo inicial:");
        String saldoInput = scanner.nextLine().replace(",", "."); // Lê o saldo inicial como String e substitui a vírgula por ponto
        double saldo = Double.parseDouble(saldoInput); // Converte a String para double

        // Exibe a mensagem final formatada com os dados da conta
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");

        // Fecha o scanner para liberar recursos
        scanner.close();
    }
}
