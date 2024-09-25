package lpa_Heranca;

public class Principal {

	public static void main(String[] args) {

		Pessoa pessoa = new Pessoa("João da Silva", "(11) 9999-999");
		System.out.println("Pessoa");
		System.out.println("Nome" + pessoa.getNome());
		System.out.println("Telefone" + pessoa.getTelefone());
		
		PessoaFisica pessoaFisica = new PessoaFisica("João da Silva", "(11) 9999-999", "123.456.789-00", "1234567");
		System.out.println("\n Pessoa Fisica:");
		System.out.println("Nome: " + pessoaFisica.getNome());
		System.out.println("Telefone" + pessoaFisica.getTelefone());
		System.out.println("Telefone" + pessoaFisica.getCpf());
		System.out.println("Telefone" + pessoaFisica.getRg());

		PessoaJuridica PessoaJuridica = new PessoaJuridica("Empresa XX","(11) 9999-999", "123.456.789-00");
		System.out.println("\n Pessoa Fisica:");
		System.out.println("Nome: " + PessoaJuridica.getNome());
		System.out.println("Telefone" + PessoaJuridica.getTelefone());
		System.out.println("Telefone" + PessoaJuridica.getCnpj());


	}

}
