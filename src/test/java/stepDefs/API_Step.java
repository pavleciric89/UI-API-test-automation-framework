package stepDefs;



import org.hamcrest.Matchers;
import static org.hamcrest.MatcherAssert.assertThat;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import ApiUtils.RestAssuredExtension;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import io.restassured.response.Response;

import io.restassured.response.ResponseOptions;

public class API_Step {
	private static ResponseOptions<Response> response;
	
	
	@Given("User perform POST operation for {string} with body")
	public void user_perform_POST_operation_for_with_body(String URL, DataTable dataTable) throws URISyntaxException {
		List<List<String>> data = dataTable.asLists();
		Map<String, String> body = new HashMap<String, String>();
		body.put(data.get(0).get(0), data.get(1).get(0));
        body.put(data.get(0).get(1), data.get(1).get(1));

		System.out.println(body);
		response = RestAssuredExtension.POSTOpsWithBody(URL, body);
		
	}

	@Then("Status code should be {int} and token: {string}")
	public void status_code_should_be_and_token(Integer statusCode, String tokenValue) {
	
		assertThat(response.statusCode(), Matchers.equalTo(statusCode));
		assertThat(response.getBody().jsonPath().get("token"), Matchers.equalTo(tokenValue));
	}
	
	@Given("User perform GET method for {string}")
	public void user_perform_GET_method_for(String URL) throws URISyntaxException {
		response = RestAssuredExtension.GetOps(URL);
	}

	@Then("Should be {int} items per page and first_name {string}")
	public void should_be_items_per_page_and_first_name(Integer numberOfItemsPerPage, String firstName) {
		assertThat(response.getBody().jsonPath().get("data[0].first_name"), Matchers.equalTo(firstName));
		assertThat(response.getBody().jsonPath().get("data"), Matchers.hasSize(numberOfItemsPerPage));
	}
	
	@Given("Perform POST operation for {string} with body")
	public void perform_POST_operation_for_with_body(String URL, io.cucumber.datatable.DataTable dataTable) throws URISyntaxException {
		List<List<String>> data = dataTable.asLists();
		Map<String, String> body = new HashMap<String, String>();
		body.put(data.get(0).get(0), data.get(1).get(0));
        body.put(data.get(0).get(1), data.get(1).get(1));
        response = RestAssuredExtension.POSTOpsWithBody(URL, body);
        
	}

	@And("Perform DELETE operation for {string}")
	public void perform_DELETE_operation_for(String pathParams) throws URISyntaxException {
		response = RestAssuredExtension.DeleteOps(pathParams);
	}

	@Then("Should be response status code {int}")
	public void should_be_response_status_code(Integer statusCode) {
		assertThat(response.statusCode(), Matchers.equalTo(statusCode));
	}
}
