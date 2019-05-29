#language: pt

Funcionalidade: Aprender Cucumber
Como um aluno 
Eu quero aprrender a aultilizar Cucumber
Para que eu possa automatizar crit�rios de aceita��o 


Cenário: Deve executar especificação 
	Dado que criei o arquivo corretamente
	Quando executá-lo 
	Então a especificação deve finalizar com sucesso
		
Cenário: Deve icrementar contador 1
	Dado que o valor do contador é 15
	Quando eu incrementar em 3
	Então o valor do contador será 18

@esse
Cenário: Deve icrementar contador 2
	Dado que o valor do contador é 123 
	Quando eu incrementar em 35 
	Então o valor do contador será 158

Cenário: Deve Calclular atraso na entregra
	Dado que a entrega é dia 05/04/2018
	Quando eu atrasar em 2 dias
	Então a entrga será efetuada em 07/04/2018
	
	
	Cenário: Deve Calclular atraso ma entrega da china
	Dado que a entrega é dia 05/04/2018
	Quando eu atrasar em 2 meses 
	Então a entrga será efetuada em 05/06/2018
	
	
	
	Cenário: Deve criar steps genéricos para estes passos
    Dado que o ticket é AF345
    E que o valor da passagem é R$ 230,45
    E que o nome do passageiro é "Fulano da Silva"
    E que o telefone do passageiro é 9999-9999
    Quando criar os steps
    Então o teste vai funcionar

Cenário: Deve reaproveitar os steps "Dado" do cenário anterior
    Dado que o ticket é AB167
    E que o ticket especial é AB167
    E que o valor da passagem é R$ 1120,23
    E que o nome do passageiro é "Cicrano de Oliveira"
    E que o telefone do passageiro é 9888-8888

@ignore
Cenário: Deve negar todos os steps "Dado" dos cenários anteriores
    Dado que o ticket é CD123
    E que o ticket é AG1234
    E que o valor da passagem é R$ 1.1345,56
    E que o nome do passageiro é "Beltrano Souza Matos de Alcântara Azevedo"
    E que o telefone do passageiro é 1234-5678
    E que o telefone do passageiro é 999-2223 
