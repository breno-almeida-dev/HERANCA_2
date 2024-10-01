/*Classe principal que define os valores de cada um dos atributos de que cada uma das classes do projeto exige.
 * Logo em seguida chama o método de exibição de cada instência das classes.*/
public class Main {

	public static void main(String[] args) {
		
		PessoaVendedor pessoaVendedor1 = new PessoaVendedor("Rafael", "123.456.789-55", "06/09/2004", "16/11/2022", 2000.00, 1.15);
		pessoaVendedor1.dadosPessoa();
		
		//Quebra de linha para melhor leitura dos dados das pessoas no terminal.
		System.out.println();
		
		
		PessoaGerente pessoaGerente1 = new PessoaGerente("Felipe", "123.456.789-55", "13/11/2001", "21/04/2022", 3500.00, "Vendas");
		pessoaGerente1.dadosPessoa();
		
		//Quebra de linha para melhor leitura dos dados das pessoas no terminal.
		System.out.println();
		
		
		PessoaCliente pessoaCliente1 = new PessoaCliente("Kiko", "123.456.789-55", "03/11/1993", "kiko@dominio.com", "123456", "(12) 34567-8912");
		pessoaCliente1.dadosPessoa();
		
	}

}
