Feature: Category

  @cat
  Scenario Outline: As a user user should be able to navigate to each category page successfully
    When user click on "<category_page>"link
    Then user should be able to navigate to related "<category_link>" page successfully
    Examples:
      | category_page     | category_link     |
      | Computers         | computers         |
      | Electronics       | electronics       |
      | Apparel           | apparel           |
      | Digital downloads | digital-downloads |
      | Books             | books             |
      | Jewelry           | jewelry           |
      | Gift Cards        | gift-cards        |

