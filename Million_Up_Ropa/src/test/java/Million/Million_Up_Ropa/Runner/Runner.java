package Million.Million_Up_Ropa.Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/Million_Ropa.feature", glue="Million.Million_Up_Ropa.Definitions")// , tags= "@tag4")
//

public class Runner {

	
}
