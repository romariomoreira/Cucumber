package br.com.romas.steps;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Assert;

import br.com.romas.converters.DateConverter;
import cucumber.api.PendingException;
import cucumber.api.Transform;
import cucumber.api.Transformer;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Ent„o;
import cucumber.api.java.pt.Quando;

public class AprenderCucumberSteps {

	@Dado("^que criei o arquivo corretamente$")
	public void queCrieiOArquivoCorretamente() throws Throwable {

	}

	@Quando("^execut·-lo$")
	public void execut·Lo() throws Throwable {

	}

	@Ent„o("^a especificaÁ„o deve finalizar com sucesso$")
	public void aEspecificaÁ„oDeveFinalizarComSucesso() throws Throwable {

	}

	private int contador = 0;

	@Dado("^que o valor do contador È (\\d+)$")
	public void que_o_valor_do_contador_È(int arg1) throws Throwable {

		contador = arg1;

	}

	@Quando("^eu incrementar em (\\d+)$")
	public void eu_incrementar_em(int arg1) throws Throwable {
		contador = contador + arg1;

	}

	@Ent„o("^o valor do contador ser· (\\d+)$")
	public void o_valor_do_contador_ser·(int arg1) throws Throwable {
		Assert.assertEquals(arg1, contador);
	}

	Date entrega = new Date();

	@Dado("^que a entrega È dia (.*)$")
	public void que_a_entrega_È_dia(@Transform(DateConverter.class)  Date data ) throws Throwable {
			entrega = data; 
		//System.out.println(entrega);

	}

	@Quando("^eu atrasar em (\\d+) (dia|dias|mes|meses)$")
	public void euAtrasarEmDias(int arg1, String tempo) throws Throwable {

		Calendar cal = Calendar.getInstance();
		cal.setTime(entrega);
		if (tempo.equals("dias")) {
			cal.add(Calendar.DAY_OF_MONTH, arg1);
		}
		if (tempo.equals("meses")) {
			cal.add(Calendar.MONTH, arg1);
		}
		entrega = cal.getTime();
	}

	@Ent„o("^a entrga ser· efetuada em (\\d{2}\\/\\d{2}\\/\\d{4})$")
	public void a_entrga_ser·_efetuada_em(String data) throws Throwable {
		DateFormat formart = new SimpleDateFormat("dd/MM/yyyy");
		String dataFormatada = formart.format(entrega);
		Assert.assertEquals(data, dataFormatada);
	}

	@Dado("^que o ticket( especial)? È (A.\\d{3})$")
	public void queOTicket…AF(String tipo, String arg1) throws Throwable {
	    
	}

	@Dado("^que o valor da passagem È R\\$ (.*)$")
	public void queOValorDaPassagem…R$(Double numero) throws Throwable {
	    
	}

	@Dado("^que o nome do passageiro È \"(.{5,20})\"$")
	public void queONomeDoPassageiro…(String arg1) throws Throwable {
	    
	}

	@Dado("^que o telefone do passageiro È (9\\d{3}-\\d{4})$")
	public void queOTelefoneDoPassageiro…(String telefone) throws Throwable {
	   
	}

	@Quando("^criar os steps$")
	public void criarOsSteps() throws Throwable {
	  
	}

	@Ent„o("^o teste vai funcionar$")
	public void oTesteVaiFuncionar() throws Throwable {
	  
	}
	
	
}
