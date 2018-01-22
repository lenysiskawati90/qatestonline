   Feature:
     In Order to Know all Gojek Product
     User should be able to see Product Details Info

     Scenario Outline: User should be able to see product details info
       Given I open website gojek
       And I click layanan button
       When I click images <product_option>
       Then I should see 'Kenapa <product_option>'

       Examples:
       | product_option  |
       | GO-RIDE         |
       | GO-CAR          |
