package lpa_Heranca;

public class PrincipalVeiculo {

	public static void main(String[] args) {
		Veiculo veiculo = new Veiculo("Ferrari", "gt" , 2007, "Vermelha");
		System.out.println("Veículo: ");
		System.out.println("Marca: " + veiculo.getMarca());
		System.out.println("Modelo: " + veiculo.getModelo());
		System.out.println("Ano: " + veiculo.getAno());
		System.out.println("Cor: " + veiculo.getCor());
		
		VeiculoAutomovel automovel = new VeiculoAutomovel("Ferrari", "gt" , 2007, "Vermelha", 4, "a5");
		System.out.println("\n Automovel:");
		System.out.println("Marca: " + automovel.getMarca());
		System.out.println("Modelo: " + automovel.getModelo());
		System.out.println("Ano: " + automovel.getAno());
		System.out.println("Cor: " + automovel.getCor());
		System.out.println("Número de portas: " + automovel.getNumeroPortas());
		System.out.println("motor: " + automovel.getMotor());

		VeiculoMoto moto = new VeiculoMoto("Honda", "gt" , 2007, "Vermelha", 300);
		System.out.println("\n Moto:");
		System.out.println("Marca: " + moto.getMarca());
		System.out.println("Modelo: " + moto.getModelo());
		System.out.println("Ano: " + moto.getAno());
		System.out.println("Cor: " + moto.getCor());
		System.out.println("Cilindradas: " + moto.getCilindrada());

	}

}
