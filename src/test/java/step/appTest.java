package step;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty","json:src/test/resources/json/sample.json"},
        features = {"src/test/java/step/us1"},
        glue = {"step.us1"}
)
public class appTest {

}