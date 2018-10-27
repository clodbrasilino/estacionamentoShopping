package Classes;

public class Atendente {

	private String nome;

	private int identificacao;

	private Ticket[] ticketsDadoBaixa;

	public void darBaixa(Ticket ticket) {
		// Verdadeiro significa saida liberada	
		ticket.setDadoBaixa(true);
	}
}
