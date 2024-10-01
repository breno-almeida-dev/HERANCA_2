/*Classe PessoaCliente, que extende a super classe Pessoa, que define seus atributos únicos como privados
 * para manipulação apenas de dentro da classe.*/
public class PessoaCliente extends Pessoa{
	private String email;
	private String numeroFidelidade;
	private String telefone;
	
	
	
	/*Método construtor que instância os atributos vindos da super classe mais os atributos únicos desta classe
	 * para serem manipulados internamente nesta classe.*/
	public PessoaCliente(String nome, String cpf, String dataNascimento, String email, String numeroFidelidade, String telefone) {
		super(nome, cpf, dataNascimento);
		this.email = email;
		this.numeroFidelidade = numeroFidelidade;
		this.telefone = telefone;
	}
	
	
	
	/*Setters para instanciar os atributos desta classe com os valores dos atributos informados
	 * na classe Main.*/
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	public void setNuemroFidelidade(String numeroFidelidade) {
		this.numeroFidelidade = numeroFidelidade;
	}
	
	
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	
	/*Getters que quando acessados retornam os valores dos atributos após serem instanciados
	 * nos Setters.*/
	public String getEmail() {
		return
				email;
	}
	
	
	
	public String getNumeroFidelidade() {
		return
				numeroFidelidade;
	}
	
	
	
	public String getTelefone() {
		return
				telefone;
	}
	
	
	/*Método de exibição dos dados da pessoa, puxando os dados instanciados na super classe Pessoa,
	 * adicionando os atributos únicos instanciados nesta classe.
	 * Utiliza o @Override para verificar se os dados vindos da super classe estão sendo realmente
	 * sobrescritos para mostrar no terminal.*/
	@Override
	public void dadosPessoa() {
		super.dadosPessoa();
		System.out.println("Email: " + getEmail());
		System.out.println("Número do Cartão Fidelidade: " + getNumeroFidelidade());
		System.out.println("Telefone: " + getTelefone());
	}
}
