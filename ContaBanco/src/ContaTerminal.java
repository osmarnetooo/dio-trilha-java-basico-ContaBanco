public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO:Conhecer e importar a classe scanner
        //Exibir as mensagens para o nosso usuário
        //Obter pela scanner os valores digitados no terminal
        //Exibir a mensagem conta criada
        CriarConta criarConta = new CriarConta();

        criarConta.novaConta();
        System.out.println("Olá " + criarConta.primeiro_Nome.concat(" " + criarConta.sobrenome) + ", obrigado por criar uma conta em nosso banco, sua agência é " + criarConta.agencia + ", conta " + criarConta.conta + " e seu saldo de R$" + criarConta.saldo + " já está disponivél para interações.");
    }
}
