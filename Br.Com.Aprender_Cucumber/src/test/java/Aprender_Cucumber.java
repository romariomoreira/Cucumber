import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Ent�o;
import cucumber.api.java.pt.Quando;
import sun.java2d.pipe.hw.AccelGraphicsConfig;





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
	
private int contador = 0 ; 	

@Dado("^que o valor do contador � (\\d+)$")
public void que_o_valor_do_contador_�(int arg1) throws Throwable {
	
	contador = arg1 ; 
    
}

@Quando("^eu incrementar em (\\d+)$")
public void eu_incrementar_em(int arg1) throws Throwable {
	contador = contador + arg1 ;  
    
}

@Ent�o("^o valor do contador ser� (\\d+)$")
public void o_valor_do_contador_ser�(int arg1) throws Throwable {
   System.out.println(arg1);
   System.out.println(contador);
   System.out.println(arg1 == contador);
}



}
