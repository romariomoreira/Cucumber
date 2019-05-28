
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Assert;

import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Ent�o;
import cucumber.api.java.pt.Quando;

public class Aprender_Cucumber {

	@Dado("^que criei o arquivo corretamente$")
	public void queCrieiOArquivoCorretamente() throws Throwable {

	}

	@Quando("^execut�-lo$")
	public void execut�Lo() throws Throwable {

	}

	@Ent�o("^a especifica��o deve finalizar com sucesso$")
	public void aEspecifica��oDeveFinalizarComSucesso() throws Throwable {

	}

	private int contador = 0;

	@Dado("^que o valor do contador � (\\d+)$")
	public void que_o_valor_do_contador_�(int arg1) throws Throwable {

		contador = arg1;

	}

	@Quando("^eu incrementar em (\\d+)$")
	public void eu_incrementar_em(int arg1) throws Throwable {
		contador = contador + arg1;

	}

	@Ent�o("^o valor do contador ser� (\\d+)$")
	public void o_valor_do_contador_ser�(int arg1) throws Throwable {
		Assert.assertEquals(arg1, contador);
	}

	Date entrega = new Date();

	@Dado("^que a entrega � dia (\\d+)/(\\d+)/(\\d+)$")
	public void que_a_entrega_�_dia(int dia, int mes, int ano) throws Throwable {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DAY_OF_MONTH, dia);
		cal.set(Calendar.MONTH, mes - 1);
		cal.set(Calendar.YEAR, ano);
		entrega = cal.getTime();

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

	@Ent�o("^a entrga ser� efetuada em (\\d{2}\\/\\d{2}\\/\\d{4})$")
	public void a_entrga_ser�_efetuada_em(String data) throws Throwable {
		DateFormat formart = new SimpleDateFormat("dd/MM/yyyy");
		String dataFormatada = formart.format(entrega);
		Assert.assertEquals(data, dataFormatada);
	}

	@Dado("^que o ticket( especial)? � (A.\\d{3})$")
	public void queOTicket�AF(String tipo, String arg1) throws Throwable {
	    
	}

	@Dado("^que o valor da passagem � R\\$ (\\d+),(\\d+)$")
	public void queOValorDaPassagem�R$(int arg1, int arg2) throws Throwable {
	    
	}

	@Dado("^que o nome do passageiro � \"(.{5,20})\"$")
	public void queONomeDoPassageiro�(String arg1) throws Throwable {
	    
	}

	@Dado("^que o telefone do passageiro � (9\\d{3}-\\d{4})$")
	public void queOTelefoneDoPassageiro�(String telefone) throws Throwable {
	   
	}

	@Quando("^criar os steps$")
	public void criarOsSteps() throws Throwable {
	  
	}

	@Ent�o("^o teste vai funcionar$")
	public void oTesteVaiFuncionar() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	
	
}
