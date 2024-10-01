/*Classe PessoaVendedor que extende a classe Pessoa, nesta classe os atributos são privados para serem acessados
 * apenas de dentro da classe.*/
public class PessoaVendedor extends Pessoa{
	private String dataContratacao;
	private double salarioBase;
	private double percentualComissao;
	
	
	/*Método construtor que puxa os atributos da super classe Pessoa, e adiciona os atributos desta classe, e define os
	 * parâmetros para instancia-las com o valor inicial dos parâmetros.*/
	public PessoaVendedor(String nome, String cpf, String dataNascimento, String dataContratacao, double salarioBase, double percentualComissao) {
		super(nome, cpf, dataNascimento);
		this.dataContratacao = dataContratacao;
		this.salarioBase = salarioBase;
		this.percentualComissao = percentualComissao;
	}
	
	
	/*Setters para instância dos atributos da classe com valores vindos da classe Main.*/
	public void setDataContratacao(String dataContratacao) {
		this.dataContratacao = dataContratacao;
	}
	
	
	
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	
	
	public void setPercentualComissao(double percentualComissao) {
		this.percentualComissao = percentualComissao;
	}
	
	
	
	/*Getters que quando acessados retornam o valor de seus respectivos atributos após
	 * serem processados dentro da classe.*/
	public String getDataContratacao() {
		return
				dataContratacao;
	}
	
	
	
	public double getSalarioBase() {
		return
				salarioBase;
	}
	
	
	
	public double getPercentualComissao() {
		return
				percentualComissao;
	}
	
	
	/*Método de exibição dos dados da pessoa, que puxa os dados vindos da super classe, e utilizando o @Override para
	 * verificar os dados vindos da outra classe e garantir que são válidos, e utiliza os dados desta para sobrescrevê-los 
	 * e assim retornar os dados do gerente.*/
	@Override
	public void dadosPessoa() {
		super.dadosPessoa();
		System.out.println("Data de contratação: " + getDataContratacao());
		System.out.println("Salário base: R$ " + getSalarioBase());
		System.out.println("Percentual de comissão: " + getPercentualComissao());
	}
	
}
