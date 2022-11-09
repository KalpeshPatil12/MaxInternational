Feature: Welcome To Max feature

Background: 
    Given user enter the url "https://www.max.com/"

Scenario: Welcome To Max Scenario

Then I verify Welcome to max appers in a screen
When I mouse hover over the language tab color change to blue
When user click on Spanish tab
Then I verify English language converted into Spanish
When I click on English tab
When I select the location as Australia
Then I verify in home page Australia location is displayed
Then I verify currency code apper as per the country
Then I verify Why Max text appers in a home screen
When I select the country from the dropdown
When I select the language from the dropdown
When I click on MAX INTERNATIONAL logo
Then I verify cart symbol appers on the homepage
When I click on My cart icon on the homepage
When I click on weight management option on the home page
Then I verify I am in on Weight Management page
When I click on Nutritionals option on the home page
Then I verify I am in on Nutritionals page
When I click on Beauty option on a home page
Then I verify I am in on Beauty page
When I click on Why Max option on a home page
Then I verify I am in on Why Max page
When I click on Love the Product Share the Product on the home page
Then I verify I To learn more about Associate Opportunity option is displayed
When I click on Become a Preferred Customer option on home page
Then I verify I To learn more about Associate Opportunity Option is displayed
When I click on More Flexibility More Income More Opportunity option on home page
Then I verify I To Learn more about Associate Opportunity option is displayed


@Test_Cases
Scenario: HomeScreen 

When I select the location as Australia
When I click on My cart icon on the homepage
When I click on login hyperlink
Then I verify I am in Sign In To Max page
When I click on Shop option
When I click on Add to Cart option for any product
When I click on MAX INTERNATIONAL logo
When I again click on My cart icon on the homepage
When I delete the product into the My Cart
Then I verify Yor cart is empty text is dislayed

@Test_Case1
Scenario: HomeScreen Weight management’ option should not appear on the homepage when it is not available inside the products header menu

When I select the location as Australia
When I select the country from the dropdown
Then I verify in Weight Management Image weight management option is not displayed
When I mouse hovwe on Product option

@Test_Case2376
Scenario: To verify that the Max logo(tag line)available on the header should also change in to Spanish language like the logo

When I select the location as Australia
When I select the language from the dropdown
Then I verify the Max International logo
Then I also verify Max International logo in the footer

@Test_Case197868
Scenario: Verify member login option is available and clickable on the homerpage

When I select the location as Australia
Then I verify Member Login Option is displayed on the home page
When I click on Member Login option on the home page
Then I verify I am in Sign In To Max page

@Test_Case197884
Scenario: Verify Product is available and clickable on the home page

When I select the location as Australia
Then I verify Product option is displayed on the home page
When I click on the Product option on the home page
Then I verify Product page is displayed

@Test_Case197875
Scenario: Verify Shop option is displayed and clickable

When I select the location as Australia
Then I verify shop option is displayed on the home page
When I click on Shop option
Then I verify shop page is open

@Test_Case197876
Scenario: Verify Join option is displayed and clickable

When I select the location as Australia
Then I verify Join option is displayed on the homer page
When I click on Join option on the home page
Then I verify I To learn more about Associate Opportunity option is displayed

@Test_Case197877
Scenario: To verify mouse hover over the header menu product Beauty, Nutritionals, Weight Management option is displayed

When I select the location as Australia
When I mouse hover over the Product option
Then I verify Beauty option is displayed
#Then I verify Weight Management option is displayed
#Then I verify Nutritionals option is displayed
