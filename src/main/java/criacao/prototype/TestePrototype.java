package criacao.prototype;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.HashSet;
import java.util.Set;

public class TestePrototype {
	public static void main(String[] args) {
		String nome = "JDBI - TI";
		LocalDateTime vencimento = LocalDateTime.of(2017, Month.APRIL, 10, 00, 00, 00);
		Set<String> hashSet = new HashSet<String>();
		hashSet.add(" Pós WebMobile");
		hashSet.add(" UNISAL ");
		hashSet.add(" 2016 ");
		
		Campanha campanha = new Campanha(nome, vencimento, hashSet);
		System.out.println(campanha.toString());
				
		Campanha campanha2 = campanha.clone();
		System.out.println(campanha2.toString());
	}
}
