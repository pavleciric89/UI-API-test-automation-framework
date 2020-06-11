package stepDefs;


import java.util.List;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

import pageObjects.Login_Page;


public class UI_LoginStep {
	
	public Login_Page loginPage = new Login_Page();
	
	
	
	@Given("User is on login page")
	public void user_is_on_login_page()  {
	   System.out.println("Lounching browser and site https://www.saucedemo.com/ "); 
	}
	@When("User enters invalid username or invalid password")
	public void user_enters_invalid_username_or_invalid_password(DataTable credentials) throws Exception {
		List<List< String>> data = credentials.asLists();
		String username = data.get(1).get(0);
		String password = data.get(1).get(1);
		loginPage.sendLoginCredentials(username, password);	
	}
	@And("User clicks on login button")
	public void user_clicks_on_login_button() throws Exception {
		loginPage.clickLoginButton();
	}
	@Then("Should be visible message for incorrect credentials")
	public void should_be_visible_message_for_incorrect_credentials() throws Exception {
		loginPage.visibilityOfInvalidCredentialsMsg();
	}
	
	@When("User enter a valid credentials")
	public void user_enter_a_valid_credentials(){
		String username = "standard_user";
		String password = "secret_sauce";
		loginPage.sendLoginCredentials(username, password);	
	}

	@And("Clicks on login button")
	public void clicks_on_login_button() throws Exception {
		loginPage.clickLoginButton();
	}
	@Then("User should login successfully and get access to inventory page")
	public void user_should_login_successfully_and_get_access_to_inventory_page() {
		loginPage.accessToInventoryPage();
	}
	
}

	
