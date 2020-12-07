pragma solidity ^0.4.17;
 
 contract Authentic {
     address public manufacturer;
     
     //Constructor to initialize manufacturer who deploy this contract
     function Authentic()public{
         manufacturer=msg.sender;
     }
     
     // Structure to keep product details
     struct product{
         string product_id;
         string product_name;
         string model;
         string brand;
         string owner;
         string owner_location;
         string manufacturer_name;
         address owner_address;
     }
     
     modifier restricted(){
         require(manufacturer==msg.sender,"You can not add Product");
         _;
     }
     
     //Map for mapping product id with product details
     mapping(string=>product) product_array;
     
     //Product add function only have access to manufacturer
     function addProduct(string _id,string p_name,string model_,string brand_,string owner_,string owner_loc,string m_name) public restricted returns(uint){
         
         product current ;
         current.product_id = _id;
         current.product_name = p_name;
         current.model = model_;
         current.brand = brand_;
         current.owner = owner_;
         current.owner_location = owner_loc;
         current.owner_address=msg.sender;
         current.manufacturer_name = m_name;
         product_array[_id]=current;
         
         return 1;
         
     }
     
    //Change owner name
     function change_owner(address new_owner_address,string new_owner_name,string p_id,string new_owner_location)public returns (uint){
         
         require(product_array[p_id].owner_address == msg.sender,"You are not owner of given product id");
         product_array[p_id].owner_address= new_owner_address;
         product_array[p_id].owner= new_owner_name;
         product_array[p_id].owner_location= new_owner_location;
         return 1;
         
         
     }
     
    //Returns owner name
    function ask_owner_name(string _id) public view returns (string){
          return(product_array[_id].owner);
    }
      
    //Returns owner location
    function ask_owner_location(string _id) public view returns (string){
          return(product_array[_id].owner_location);
    }
    
    //Returns manufacturer name
    function ask_manufacturer_name(string _id) public view returns (string){
          return(product_array[_id].manufacturer_name);
    }
    
    //Returns Poduct name
    function ask_product_name(string _id) public view returns (string){
          return(product_array[_id].product_name);
    }
    
    //Returns Poduct id
    function ask_product_id(string _id) public view returns (string){
          return(product_array[_id].product_id);
    }
    
}
