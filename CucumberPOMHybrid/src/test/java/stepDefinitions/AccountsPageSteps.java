package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.pages.AccountsPage;
import com.pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AccountsPageSteps {
	
	private LoginPage loginPage= new LoginPage(DriverFactory.getDriver());
	private AccountsPage accountsPage= new AccountsPage(DriverFactory.getDriver());
	
	@Given("user has already logged in to application")
	public void user_has_already_logged_in_to_application(DataTable crdTable) {

		List<Map<String, String>> crdList=crdTable.asMaps();
		String username= crdList.get(0).get("username");
		String password= crdList.get(0).get("password");
		
		DriverFactory.getDriver().get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		loginPage.doLogin(username, password);
	}

	@Given("user is on Accounts page")
	
	public void user_is_on_accounts_page() {
		String title=accountsPage.accountsPageTitle();
		System.out.println("Accounts Page Title: "+title);
	}

	@Then("user gets accounts section")
	public void user_gets_accounts_section(DataTable sectionsTable) {
		List<String> expectedSectionlist= sectionsTable.asList();
		System.out.println("Expected account section list: "+expectedSectionlist);
		List<String> actualSectionlist= accountsPage.getAccountSectionList();
		System.out.println("Actual account section list: "+actualSectionlist);
		Assert.assertTrue(expectedSectionlist.containsAll(actualSectionlist));
	}

	@Then("accounts section count should be {int}")
	public void accounts_section_count_should_be(Integer exptectedCount) {
		Assert.assertTrue(accountsPage.getAccountSectionCount()== exptectedCount);
	}

 

}
