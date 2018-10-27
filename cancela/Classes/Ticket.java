package Classes;

public class Ticket {

	private int codigoDeBarras;

	private Instant horaDeEmissao;

	private boolean dadoBaixa;

	private Instant horaDeSaida;

	private Veículo veículo;

	public Duration tempoDeEstadia() {
		return null;
	}

	public void setDadoBaixa(boolean novoValor){
		dadoBaixa = novoValor;
	}

}
