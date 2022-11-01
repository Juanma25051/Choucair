#Actor jloaizap@choucairtesting.com
@Feature1
Feature:verify the correct operation of register
  As a user, I want to register on Utest web page.
  @Scenario1
  Scenario Outline: Register in Utests
    Given enter in the Utest Web site
    When complete the first form Tell us about yourself
      |firstName|lastName|e_mail|monthBirth|dayBirth|yearBirth|
      |<firstName>|<lastName>|<e_mail>|<monthBirth>|<dayBirth>|<yearBirth>|
    And complete the second form Add your address
    And complete the third form Tell us about your devices
      |mobile |model |operatingSystem|
      |<mobile>|<model>|<operatingSystem>|
    And complete the last form The last step
      |password|confirmPassword|
      |<password>|<confirmPassword>|
    Then View the tittle for register in the page
      |tittle|
      |<tittle>|
    Examples:
      |firstName|lastName|e_mail|monthBirth|dayBirth|yearBirth|mobile|model|operatingSystem|password|confirmPassword|tittle|
      |Pedro |benites  |ch16_pruebas123@gmail.com|May|30|number:2002|Samsung|Galaxy S6 Edge|Android 8.0 (Oreo)|Pruebatecnica123|Pruebatecnica123|Welcome to the world's largest community of freelance software testers!|