package org.adactin.stepdefinition;

import org.adactin.testrunner.Runnerclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.textui.TestRunner;

public class StepDefinition {

	public static WebDriver driver =Runnerclass.driver;
	
	@Given("^To Launch The Url Of The Adactin Web Application$")
	public void to_Launch_The_Url_Of_The_Adactin_Web_Application() throws Throwable {
	   driver.get("https://adactinhotelapp.com/");
		
	}

	@When("^user Enter The Username In The Username Field$")
	public void user_Enter_The_Username_In_The_Username_Field() throws Throwable {
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("jagadesh96");
	}

	@When("^user Enter The Password In The Password Field$")
	public void user_Enter_The_Password_In_The_Password_Field() throws Throwable {
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("jaga1412");
	}

	@Then("^user click the Login Button And Navigate to Next Page$")
	public void user_click_the_Login_Button_And_Navigate_to_Next_Page() throws Throwable {
		WebElement login = driver.findElement(By.xpath("//input[@type='Submit']"));
		login.click();
	}

	@When("^user Select The Location In The Location Drop-Down Field$")
	public void user_Select_The_Location_In_The_Location_Drop_Down_Field() throws Throwable {
		WebElement location = driver.findElement(By.id("location"));
		Select a = new Select(location);
		a.selectByValue("New York");

	}

	@When("^user Select The Hotels In The Hotels Drop-Down Field$")
	public void user_Select_The_Hotels_In_The_Hotels_Drop_Down_Field() throws Throwable {
		WebElement hotels = driver.findElement(By.id("hotels"));
		Select b = new Select(hotels);
		b.selectByIndex(1);   
	}

	@When("^user Select The Room_Types In The Room_Types Drop-Down Field$")
	public void user_Select_The_Room_Types_In_The_Room_Types_Drop_Down_Field() throws Throwable {
		WebElement room = driver.findElement(By.id("room_type"));
		Select c = new Select(room);
		c.selectByIndex(1);

	}

	@When("^user Select the Number_Of_Rooms In The Number_Of_Rooms Field$")
	public void user_Select_the_Number_Of_Rooms_In_The_Number_Of_Rooms_Field() throws Throwable {
		WebElement number = driver.findElement(By.id("room_nos"));
		Select d = new Select(number);
		d.selectByValue("3");
	}

	@When("^user Select the Check_In_Date In The Check_In_Date Drop-Down Field$")
	public void user_Select_the_Check_In_Date_In_The_Check_In_Date_Drop_Down_Field() throws Throwable {

		WebElement date = driver.findElement(By.className("date_pick"));
		date.sendKeys("29/9/23");
	}

	@When("^user Select the Check_Out_Date In The Check_Out_Date Drop-Down Field$")
	public void user_Select_the_Check_Out_Date_In_The_Check_Out_Date_Drop_Down_Field() throws Throwable {

		WebElement out = driver.findElement(By.id("datepick_out"));
		out.sendKeys("30/9/23");

	}

	@When("^user Select the Adults_Per_Room In The Adults_Per_Room Drop-Down Field$")
	public void user_Select_the_Adults_Per_Room_In_The_Adults_Per_Room_Drop_Down_Field() throws Throwable {
		WebElement adult = driver.findElement(By.id("adult_room"));
		Select e = new Select(adult);
		e.selectByValue("3");
	}

	@When("^user Select the Children_Per_Room In The Children_Per_Room Drop-Down Field$")
	public void user_Select_the_Children_Per_Room_In_The_Children_Per_Room_Drop_Down_Field() throws Throwable {
		WebElement child = driver.findElement(By.xpath("//select[@name='child_room']"));
		Select f = new Select(child);
		f.selectByIndex(2);
	}

	@Then("^user Click the Search Button And Navigate to Next Page$")
	public void user_Click_the_Search_Button_And_Navigate_to_Next_Page() throws Throwable {
		WebElement submit = driver.findElement(By.xpath("//input[@id='Submit']"));
		submit.click();
	}

	@When("^user Select The Hotel Name In Select Radio Button$")
	public void user_Select_The_Hotel_Name_In_Select_Radio_Button() throws Throwable {
		WebElement radio = driver.findElement(By.id("radiobutton_0"));
		radio.click();
	}

	@Then("^user Click the Click Button  And Navigate to Next Page$")
	public void user_Click_the_Click_Button_And_Navigate_to_Next_Page() throws Throwable {
		WebElement ok = driver.findElement(By.id("continue"));
		ok.click();
	}

	@When("^user Enter The First Name in the FirstName Field$")
	public void user_Enter_The_First_Name_in_the_FirstName_Field() throws Throwable {
		WebElement firstname = driver.findElement(By.xpath("//input[@name='first_name']"));
		firstname.sendKeys("jagadesh");
	}

	@When("^user Enter The Last Name in the LastName Field$")
	public void user_Enter_The_Last_Name_in_the_LastName_Field() throws Throwable {

		WebElement lastname = driver.findElement(By.xpath("//input[@name='last_name']"));
		lastname.sendKeys("pannerselvam");
	}

	@When("^user Enter the Address in the Billing Address Field$")
	public void user_Enter_the_Address_in_the_Billing_Address_Field() throws Throwable {
		WebElement address = driver.findElement(By.id("address"));
		address.sendKeys("anna nagar");
	}

	@When("^user Enter the Credit Card Number in the CreditCard Number field$")
	public void user_Enter_the_Credit_Card_Number_in_the_CreditCard_Number_field() throws Throwable {

		WebElement credit = driver.findElement(By.id("cc_num"));
		credit.sendKeys("7777777777777777");
	}

	@When("^user Select the Credit Card Type in the CreditCard Type$")
	public void user_Select_the_Credit_Card_Type_in_the_CreditCard_Type() throws Throwable {
		WebElement crecard = driver.findElement(By.xpath("//select[@id='cc_type']"));
		Select g = new Select(crecard);
		g.selectByValue("VISA");
	}

	@When("^user Select the Expiry month and Expiry Year in the  Expiry Date Dropdown$")
	public void user_Select_the_Expiry_month_and_Expiry_Year_in_the_Expiry_Date_Dropdown() throws Throwable {
		WebElement exmonth = driver.findElement(By.id("cc_exp_month"));
		Select h = new Select(exmonth);
		h.selectByValue("3");
		WebElement exyear = driver.findElement(By.id("cc_exp_year"));
		Select i = new Select(exyear);
		i.selectByValue("2025");
	}
	

	@When("^user Enter the CVV number in the CVV number field$")
	public void user_Enter_the_CVV_number_in_the_CVV_number_field() throws Throwable {
		WebElement cvv = driver.findElement(By.id("cc_cvv"));
		cvv.sendKeys("777");
	}

	@Then("^user Click the BookNow Button And It will navigate to the Booking Confirmation Page$")
	public void user_Click_the_BookNow_Button_And_It_will_navigate_to_the_Booking_Confirmation_Page() throws Throwable {
		WebElement book = driver.findElement(By.id("book_now"));
		book.click();
		
		


}}
