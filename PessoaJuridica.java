package lpa_Heranca;

public class PessoaJuridica extends Pessoa {
	private String cnpj;
	
	public PessoaJuridica(String nome, String telefone, String cnpj) {
		super(nome, telefone);

		this.cnpj = cnpj;
	
	}


	public String getCnpj() {
		return cnpj;
	}

	public void setCpf(String cnpj) {
		this.cnpj = cnpj;
	}
	

}
