Feature: Welcome To Max feature

Background: 
    Given user enter the url "https://www.max.com/"
    
@Test_Case
Scenario: Why Max Scenarios

When I select the location as Australia
Then I verify user is able to see Why Max option
When I click on Why Max option
Then I verify I am in on Why Max page

@Test_Case1351
Scenario: To verify that user is able to load the content under The Max Difference

When I select the location as Australia
When I click on Why Max option
Then I verify the max difference option is displayed
When I click on max difference option
Then I verify Max difference page is loaded
Then I verify Science option is displayed
When I click on Science option
Then I verify Science page is loaded
Then I verify Company option is displayed
When I click on Company option
Then I verify Company page is loaded
Then I verify Media option is displayed
When I click on Media option
Then I verify Media page is loaded

@Test_Case1367
Scenario: To verify that user is able to open and close the Puerto Rico2017

When I select the location as Australia
When I click on Why Max option
Then I verify Puerto Rico2017 option is displayed
When I click on Puerto Rico2017 option
Then I verify Puerto Rico2017 page is open
#When I click on close option

@Test_Case1374
Scenario: To verify that user is able to play, pause and scrub the video in Puerto Rico2017

When I select the location as Australia
When I click on Why Max option
Then I verify Puerto Rico2017 option is displayed
When I click on Puerto Rico2017 option
Then I verify Puerto Rico2017 page is open
When I click on play button

@Test_Case1379
Scenario: To verify user is able to open and close Phuket Thailand2015

When I select the location as Australia
When I click on Why Max option
Then I verify Phuket Thailand2015 option is displayed
When I click on Phuket Thailand2015 option
Then I verify Phuket Thailand2015 page is open
#When I click on close option

@Test_Case1384
Scenario: To verify user is able to open and close Punta Cana Dominican Republic2014

When I select the location as Australia
When I click on Why Max option
Then I verify Punta Cana Dominican Republic2014 option is displayed
When I click on Punta Cana Dominican Republic2014 option
Then I verify Punta Cana Dominican Republic2014 page is open

@Test_Case197880
Scenario: To verify user is able to open and close Peru2018

When I select the location as Australia
When I click on Why Max option
Then I verify Peru2018 option is displayed
When I click on Peru2018 option
Then I verify Peru2018 page is open

@Test_Case197882
Scenario: To verify user is able to open and close South Afric2019

When I select the location as Australia
When I click on Why Max option
Then I verify South Afric2019 option is displayed
When I click on South Afric2019 option
Then I verify South Afric2019 page is open

@Test_Case1515
Scenario: To verify Company page change according to the language

When I select the location as Australia
When I click on Why Max option
Then I verify Company option is displayed
When I click on Company option
When I select the laguage as French
Then I verify Company page

@Test_Case2609
Scenario: To verify media page translate according to the language

When I select the location as Australia
When I click on Why Max option
Then I verify Media option is displayed
When I click on Media option
When I select the laguage as French
Then I verify Media page

@Test_Case2412
Scenario: To verify country dropdown appers according to the alphabetical order

When I select the location as Australia
Then I verify the country dropdown list

@Test_Case @test_demo
Scenario: To verify Language dropdown appears according to the alphabetical order

When I select the location as Australia
Then I verify the language dropdown list

@Test_Case2358 @test_demo
Scenario: To verify that the information available on the max gives back page will change according to the language selected by the user

When I select the location as Australia
When I mouse hover over the Why Max option
When I click on Max Gives Back option
When I select the laguage as French
Then I verify Max Gives Back page

@Test_Case2378 @test_demo
Scenario: To verify that the biography text for Scott Momii is correct and proper

When I select the location as Australia
When I mouse hover over the Why Max option
When I click on Science Option
Then I verify Scott Momii option is displayed
When I click on Scott Momii option
Then I verify Scott Momii imformation page is displayed

@Test_Case192308
Scenario: To verify ‘Blog’ option should appear on the ‘media’ page

When I select the location as Australia
When I mouse hover over the Why Max option
When I click on Media Option
Then I verify in Media page blog option is displayed

@Test_Case198074
Scenario: To verify Paula Hernandez Executive name is available within the Executive Team lists

When I select the location as Australia
When I mouse hover over the Why Max option
Then I verify Executive Team option is displayed
When I click on Executive Team option
Then I verify Paula Hernandez option is displayed

@Test_Case197886
Scenario: To verify banner image on WHY MAX page is available & visible

When I select the location as Australia
When I click on Why Max option
When I click on max difference option
Then I verify banner image on Why Max page

@Test_Case39326
Scenario: To verify that the Jennifer Arias Biography is updated

When I select the location as Australia
When I mouse hover over the Why Max option
Then I verify Executive Team option is displayed
When I click on Executive Team option
Then I verify Jennifer Arias option is displayed
When I click on Jennifer Arias
Then I verify Jennifer Aris biography is displayed








