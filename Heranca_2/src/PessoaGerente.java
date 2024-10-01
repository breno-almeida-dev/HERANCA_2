/*Classe PessoaGerente que extende a super classe Pessoa puxando seus atributos e adiciona os seus atributos
 * únicos da classe para cadastro de um gerente.
 * Define seus atributos como privados para acesso e manipulação direto apenas de dentro da classe.*/
public class PessoaGerente extends Pessoa {
	private String dataContratacao;
	private double salarioBase;
	private String departamento;
	
	
	
	/*Método construtor da classe, que define os seus parâmetros únicos da classe mais os parâmetro vindos da super classe, e as instância
	 * com o valor igual, para serem trabalhadas dentro da classe.*/
	public PessoaGerente(String nome, String cpf, String dataNascimento, String dataContratacao, double salarioBase, String departamento) {
		super(nome, cpf, dataNascimento);
		this.dataContratacao = dataContratacao;
		this.salarioBase = salarioBase;
		this.departamento = departamento;
	}
	
	
	
	/*Setters para instância dos atributos da classe com os valores vindos da classe Main.*/
	public void setDataContratacao(String dataContratacao) {
		this.dataContratacao = dataContratacao;
	}
	
	
	
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	
	
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	
	
	/*Getters que quando acessados retornam os valores de seus respectivos atributos após serem "settados".
	 * Podem ser acessados de dentro da classe no método de exibição ou de fora da classe.*/
	public String getDataContratacao() {
		return
				dataContratacao;
	}
	
	
	
	public double getSalarioBase() {
		return
				salarioBase;
	}
	
	
	
	public String getDepartamento() {
		return
				departamento;
	}
	
	
	/*Método de exibição dos dados da pessoa, que puxa os dados vindos da super classe, e utilizando o @Override para
	 * verificar os dados vindos da outra classe e utiliza os dados desta para sobrescrevê-los e assim retornar os dados
	 * do gerente.*/
	@Override
	public void dadosPessoa() {
		super.dadosPessoa();
		System.out.println("Data de contratação: " + getDataContratacao());
		System.out.println("Salário base: R$ " + getSalarioBase());
		System.out.println("Departamento: " + getDepartamento());
		
	}
}
