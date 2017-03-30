package criacao.builders;

public class GeradorBoleto {
	private BoletoBuilder boletoBuilder;
	private BoletoVO vo;

	public GeradorBoleto(BoletoBuilder boletoBuilder, BoletoVO vo) {
		super();
		this.boletoBuilder = boletoBuilder;
		this.vo = vo;
	}
	
	public Boleto geraBoleto() {
		this.boletoBuilder.buildSacado(vo.getSacado());
		this.boletoBuilder.buildCedente(vo.getCedente());
		this.boletoBuilder.buildValor(vo.getValor());
		this.boletoBuilder.buildVencimento(vo.getVencimento());
		this.boletoBuilder.buildNossoNumero(vo.getNossoNumero());
		
		return this.boletoBuilder.getBoleto(); 
	}
}
