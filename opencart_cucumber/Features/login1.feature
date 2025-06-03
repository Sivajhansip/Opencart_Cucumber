Feature: Login with valid credentials

  @sanity @regression
  Scenario: Sucessful login with valid credentials
    Given the user navigate to login page
    When user enters email as "sivajhansi2410@gmail.com" & password as "Jhansi@2410"
    And the user clicks login button
    Then the user should be redirected to the MyAccount page
 
 #@regression
  #Scenario Outline: Login Data Driven
   # Given the user navigate to login page
    #When user enters email as "<email>" & password as "<password>"
    #And the user clicks login button
    #Then the user should be redirected to the MyAccount page

    #Examples: 
     # | email                     | password    |
     # | pavanol@gmail.com         | test123     |
      #| pavanoltraining@gmail.com | test@123    |
      #| sivajhansi2410@gmail.com  | Jhansi@2410 |
      


  