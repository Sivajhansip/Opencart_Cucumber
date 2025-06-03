Feature: Login Data Driven using excel
  Scenario Outline: Title of your scenario outline
    Given the user navigate to login page
    Then the user should be redirected to the MyAccount Page by passing email and password with excel row "<row_index>"

    Examples: 
      | row_index | 
      |         1 |  
      |         2 | 
      |         3 | 
      |         4 | 
      |         5 | 