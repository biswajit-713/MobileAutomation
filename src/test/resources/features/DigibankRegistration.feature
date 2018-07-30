Feature:
    DBS Bank Customer Registration on Paylah!

    Scenario: Register on Paylah as DBS customer
        Given I opt to register as DBS Customer
        When I enter my digibank details
        Then I should land in home screen