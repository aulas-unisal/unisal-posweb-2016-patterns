package criacao.abstractfactory;

public enum Bandeira {
	VISA("Visa"),
	MASTERCARD("Mastercard");
	
	private String bandeira;
	
	Bandeira(String bandeira) {
		this.bandeira = bandeira;
	}
	
	public String getBandeira(){
		return bandeira;
	}
}
