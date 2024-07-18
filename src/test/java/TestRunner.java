import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"json:target/cucumber/report.json",
                "me.jvt.cucumber.report.PrettyReports:target/",
                "pretty",
                "html:target/cucumber-reports.html"},
        features = "src/test/resources/features",
        tags = ""
)
public class TestRunner {
    @BeforeClass
    public static void setUp() {
        OnStage.setTheStage(new OnlineCast());
    }
}
