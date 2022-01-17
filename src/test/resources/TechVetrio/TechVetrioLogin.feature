@TechVetrio 
Feature: I want automate login feature of TechVetrio 

@Login 
Scenario: Login and creat TechVetrio 

	Given Login to TechVetrio  Page  
	When enter correct username as"admin@example.com"
	And enter correct password as"password"
	
@CreatingProduct 
Scenario: new product with Tittle, Sku,Description 
	Given Create new product with Tittle, Sku,Description 
	When enter Tittle 
	And enter sku 
	And enter Description 
	
@ListingProduct	
Scenario: Listing product 
	Given Listing the created product 
	
	@UpdatingProduct
Scenario: Updates Product 
	Given Updated the created product 
	
@DeletingProduct	
Scenario: Delete Product 
	Given Delete the created product 
