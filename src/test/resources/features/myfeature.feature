Feature: Gmail mail compose

  Scenario: 
    Given open "chrome" browser
    And launch site using "http://www.gmail.com"
    When do login using "shivayyakasagani235@gmail.com" and "shiva73825" credentials
    Then compose is displayed
    When click on compose and fill fields and send mail and check response
      | to                   | subject   | body      | attachment                     |
      | kasaganishiva235@gmail.com | wishes    | hi bro    |F:\PHOTOS\mother and father pics\Inbox.JPG     |
      | asti.shiva235@gmail.com | test mail | hi friend |F:\PHOTOS\mother and father pics\Inbox1.JPG |
    When do logout
    Then login page should be redisplayed
    When close site
