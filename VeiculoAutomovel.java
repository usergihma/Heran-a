package lpa_Heranca;

public class VeiculoAutomovel  extends Veiculo {;
private int numeroPortas;
private String motor;

public VeiculoAutomovel(String marca, String modelo, int ano, String cor, int numeroPortas, String motor) {
	super(marca, modelo, ano, cor);
	this.numeroPortas = numeroPortas;
	this.motor = motor;

}
public int getNumeroPortas() {
	return numeroPortas;
}

public void setNumeroPortas(int numeroPortas) {
	this.numeroPortas = numeroPortas;
}
public String getMotor() {
	return motor;
}

public void setMotor(String motor) {
	this.motor = motor;
}


}
