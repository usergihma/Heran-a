package lpa_Heranca;

public class VeiculoMoto extends Veiculo {
	private int cilindrada;

	public VeiculoMoto(String marca, String modelo, int ano, String cor, int cilindrada) {
		super(marca, modelo, ano, cor);
		this.cilindrada= cilindrada;


	}
	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}



}
