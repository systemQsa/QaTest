package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import rest.TrelloRestClient;

public class TrelloApiStepDefs {

    TrelloRestClient trelloRestClient = new TrelloRestClient();

    @When("I send a new board request")
    public void iCreateANewBoard(){
        trelloRestClient.sendCreateBoardRequest();
    }

    @When("I send delete the board request")
    public void iSendDeleteTheBoardRequest() {
            trelloRestClient.sendDeleteBoardRequest();
    }

    @Then("I see {int} status code in get board into request")
    public void iSeeStatusCodeInGetBoardIntoRequest(int statusCode) {
        trelloRestClient.sendGetBoardRequest(statusCode);
    }

    @Then("I see {int} status code in get board info request")
    public void iSeeStatusCodeInGetBoardInfoRequest(int statusCode) {
        trelloRestClient.sendGetBoardRequest(statusCode);
    }
}

