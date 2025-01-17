package utils;

import com.google.common.base.Splitter;
import io.cucumber.java.ParameterType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.junit.Before;

import java.util.List;

public class ScreenplayActors {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @ParameterType(".*")
    public Actor actor(String actorName) {
        return OnStage.theActorCalled(actorName);
    }

    @ParameterType(".*")
    public List<String> items(String listOfItems) {
        return Splitter.on(", ").trimResults().omitEmptyStrings().splitToList(listOfItems);
    }

    @ParameterType(".*")
    public List<String> items1(String listOfItems) {
        return Splitter.on(", ").trimResults().omitEmptyStrings().splitToList(listOfItems);
    }
}
