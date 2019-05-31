package br.com.romas.runners;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
				features = "src/test/resources/features/alugar_filmes.feature",
//						features = "src/test/resources/features/aprender_cucumber.feature",
				glue = "br.com.romas.steps",
				plugin = "pretty",
				tags = "~@ignore",
//						tags = "~@ignore",
				 monochrome = true, 
				 snippets = SnippetType.CAMELCASE,
				 dryRun =  false, 
				 strict = false)
				
public class Runner {

}
