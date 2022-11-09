Feature: Welcome To Max feature

Background: 
    Given user enter the url "https://www.max.com/"
    
@Test_Case1041 @test
Scenario: To verify that all the elements of the product page load properly

When I select the location as Australia
Then I verify Product option is displayed
When I click on Product option
Then I verify Product page

@Test_Case1058 @test
Scenario: To verify that user is able to redirect to the OPPORTUNITY page

When I select the location as Australia
When I click on Product option
Then I verify Opportunity option is displayed
When I click on Opportunity option
Then I verify Opportunity page

@Test_Case1059 @test
Scenario: To verify that user is able to redirect to the PRODUCTS WITH PURPOSE page

When I select the location as Australia
When I click on Product option
Then I verify Product with Purpose option
When I click on Product with Purpose option
Then I verify Product with Purpose page

@Test_Case1062 @test
Scenario: To verify that user is able to redirect to the MAX GIVES BACK page

When I select the location as Australia
When I click on Product option
Then I verify Max Gives Back option is displayed
When I click on Max Gives Back option
Then I verify Max Gives Back page

@Test_Case1063 @test
Scenario: To verify that the products title should localized according to the language selected

When I select the location as Australia
When I click on Product option
Then I observe the product banner

@Test_Case1094 @test
Scenario: To verify proper product rates are displayed for every product of Ecuador

When I select the location as Australia
When I select the country as Ecuador
When I click on Shop option
Then I verify the product price

@Test_Cas1114_1 @Test1
Scenario: To verify that the user should be redirected to the product page when clicks on the Max Atp/Max n fuze/Max one/MAX gxl /Max 357 Options from the products page.

When I select the location as Australia
When I select the country as Fiji
When I click on Product option
When I click on Product with Purpose option
When I mouse hover over on a Products option
Then I verify MaxATP option is displayed
When I click on MaxATP option
Then I verify MaxATP page

@Test_Case1114_2 @Test1
Scenario: To verify that the user should be redirected to the product page when clicks on the Max Atp/Max n fuze/Max one/MAX gxl /Max 357 Options from the products page.

When I select the location as Australia
When I select the country as Fiji
When I click on Product option
When I click on Product with Purpose option
When I mouse hover over on a Products option
Then I verify Max n fuze is displayed
When I click on Max n fuze option
Then I verify Max n fuze page

@Test_Case1114_3 @Test1
Scenario: To verify that the user should be redirected to the product page when clicks on the Max Atp/Max n fuze/Max one/MAX gxl /Max 357 Options from the products page.

When I select the location as Australia
When I select the country as Fiji
When I click on Product option
When I click on Product with Purpose option
When I mouse hover over on a Products option
Then I verify Max One option is displayed
When I click on Max One option
Then I verify Max One option page

@Test_Case1114_4 @Test1
Scenario: To verify that the user should be redirected to the product page when clicks on the Max Atp/Max n fuze/Max one/MAX gxl /Max 357 Options from the products page.

When I select the location as Australia
When I select the country as Fiji
When I click on Product option
When I click on Product with Purpose option
When I mouse hover over on a Products option
Then I verify MaxGLX option is displayed
When I click on MaxGLX option
Then I verify MaxGLX page

@Test_Case1114_5 @Test1
Scenario: To verify that the user should be redirected to the product page when clicks on the Max Atp/Max n fuze/Max one/MAX gxl /Max 357 Options from the products page.

When I select the location as Australia
When I select the country as Fiji
When I click on Product option
When I click on Product with Purpose option
When I mouse hover over on a Products option
Then I verify Max357 option is displayed
When I click on Max357 option
Then I verify Max357 page

@Test_Case1130 @Test1
Scenario: To verify that user is able to redirect to the HELP CENTER page

When I select the location as Australia
When I click on Product option
Then I verify Help Center option is displayed
When I click on Help Center option
Then I verify Help Center page

@Test_Case1135 @Test1
Scenario: To verify appropriate text Remove item appears on the products when the user clicks on the add to order button and then clicks on the - icon to decrease the item.

When I select the location as Australia
When I select the location as United State from dropdown
When I mouse hover over on a Products option
When I click on MaxATP in the Nutritionals
Then I verify add to cart option is displayed
When I click on Add to cart option
When I click on - sign
Then I verify Remove Item option is displayed

@Test_Case2405 @Test1
Scenario: To verify that the Banners of the product pages will be displayed in the localized language

When I select the location as Australia
When I mouse hover over on a Products option
Then I verify Nutrionals option is displayed
When I click on Nutritionals option
When I select the language as French
Then I verify Nutritionals page change in French language
When I select the language as Spanish
Then I verify Nutritionals page change in Spanish language

@Test_Case211656 @Test2
Scenario: To verify that the Spanish Language Change Products to Productos

When I select the location as Australia
When I select the Spanish language
Then I verify the Product text on homepage

@Test_Case22273 @Test2
Scenario: To verify updated product sheet appears for the Max GXL

When I select the location as Australia
When I select the country as Fiji
When I click on Product option
When I mouse hover over on a Products option
When I click on MaxGLX option
Then I verify Product Sheet option is displayed
When I click on Product Sheet option
#Then I verify the Product Sheet

@Test_Case1797346 @Test2
Scenario: To verify Ingredient_Icon should be displaying on Product page when user change the language spanish.

When I select the location as Australia
When I select the country as Costa Rica from the dropdown
When I mouse hover over on a Products option
When I click on Cellgevity option
Then I verify the Cellgevity Icon

@Test_Case1045 @Test2
Scenario: To verify that user is able to redirect to the Nutritionals page

When I select the location as Australia
When I click on Product option
Then I verify learn more option is displayed
When I click on learn more option
Then I verify the Nutritionals page

@Test_Case1119 @Test2
Scenario: To verify that the User will get redirected to the desired product page when clicks on the Cellgevity and MAXONE options for New Zealand.

When I select the location as Australia
When I select the New Zealand as country from the dropdown
When I mouse hover over on a Products option
When I click on Cellgevity option for New Zealand
Then I verify Cellevity page for New Zealand

@Test_Case1171 @Test3
Scenario: To verify that user is able to redirect to Cellgevity

When I select the location as Australia
When I mouse hover over on a Products option
When I click on Nutritionals Option
Then I verify Cellgevity option is displayed in Our Nutritionals Products
When I click on Cellgevity option in Our Nutritionals Products
Then I verify the Cellgevity page

@Test_Case1172 @Test3
Scenario: To verify that user is able to redirect to MaxATP

When I select the location as Australia
When I mouse hover over on a Products option
When I click on Nutritionals Option
Then I verify MaxATP option is displayed in Our Nutritionals Products
When I click on MaxATP option in Our Nutritionals Products
Then I verify MaxATP page

@Test_Case1174 @Test3
Scenario: To verify that user is able to redirect to MaxN-Fuze

When I select the location as Australia
When I mouse hover over on a Products option
When I click on Nutritionals Option
Then I verify Max N Fuze option is displayed in Our Nutritionals Products
When I click on Max N Fuze option in Our Nutritionals Products
Then I verify Max n fuze page

@Test_Case1176 @Test3
Scenario: To verify that user is able to redirect to MaxONE

When I select the location as Australia
When I mouse hover over on a Products option
When I click on Nutritionals Option
Then I verify MaxOne option is displayed in Our Nutritionals Products
When I click on MaxOne option in Our Nutritionals Products
Then I verify Max One option page

@Test_Case1180 @Test3
Scenario: To verify that user is able to redirect to MaxGLX

When I select the location as Australia
When I mouse hover over on a Products option
When I click on Nutritionals Option
Then I verify MaxGLX option is displayed in Our Nutritionals Products
When I click on MaxGLX option in Our Nutritionals Products
Then I verify MaxGLX page

@Test_case1184 @Test3
Scenario: To verify that user is able to redirect to Max357

When I select the location as Australia
When I mouse hover over on a Products option
When I click on Nutritionals Option
Then I verify Max357 option is displayed in Our Nutritionals Products
When I click on Max357 option in Our Nutritionals Products
Then I verify Max357 page

@Test_Case1201 @Test3
Scenario: To verify that user is able to add Cellgevity 1 month supply to the cart

When I select the location as Australia
When I mouse hover over on a Products option
When I click on Cellgevity option in the Nutritionals
When I click on Add to Cart option for Cellgevity one month supply
Then I verify Cellgevity one month supply added
