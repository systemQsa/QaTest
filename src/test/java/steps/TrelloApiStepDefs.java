package steps;

import io.cucumber.java.en.When;
import rest.TrelloRestClient;

public class TrelloApiStepDefs {
    TrelloRestClient trelloRestClient = new TrelloRestClient();
    @When(" create a new Board")
    public void iCreateANewBoard(){
        trelloRestClient.sendCreateBoardRequest();
    }
}

