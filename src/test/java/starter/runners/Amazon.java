package starter.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions( glue = { "starter" },
        plugin = {"pretty"},
        features = "src/test/resources/features/search/amazon.feature"
)
public class Amazon {}
