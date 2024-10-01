/*Super classe Pessoa, para instância dos dados que entre todas as sub-classe são
 * dados base e presentes em cada uma.*/
public class Pessoa {
	private String nome;
	private String cpf;
	private String dataNascimento;
	
	
	
	/*Método construtor que instância os atributos privados desta classe com os parâmetros do método.*/
	public Pessoa(String nome, String cpf, String dataNascimento) {
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
	}
	
	
	/*Setters para instância dos atributos da classe com os valores vindos da classe Main. */
	public void setNome(String nome) {
		this.nome = nome;
	}
	

	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	
	
	/*Getters que retorna o valor de cada atributo da classe, controlando o acesso aos dados.*/
	public String getNome() {
		return
				nome;
	}
	
	
	
	public String getCpf() {
		return
				cpf;
	}
	
	
	
	public String getDataNascimento() {
		return
				dataNascimento;
	}
	
	
	
	/*Método de exibição que retorna os dados, após serem instanciados, no terminal.*/
	public void dadosPessoa() {
		System.out.println("Nome: " + getNome());
		System.out.println("Endereço: " + getCpf());
		System.out.println("Data de Nascimento: " + getDataNascimento());
	}
	
}
