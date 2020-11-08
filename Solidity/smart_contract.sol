 pragma solidity ^0.4.17;
 
 contract Authentic {
     address public manufacturer;
     
     function Authentic()public{
         manufacturer=msg.sender;
     }
     
     struct product{
         string product_id;
         string product_name;
         string model;
         string brand;
         string owner;
         string owner_location;
         string manufacturer_name;
         
     }
     
     
     
     mapping(string=>product) product_array;
     
     function addProduct(string _id,string p_name,string model_,string brand_,string owner_,string owner_loc,string m_name) returns(uint){
         require(manufacturer==msg.sender);
         product current ;
         current.product_id = _id;
         current.product_name = p_name;
         current.model = model_;
         current.brand = brand_;
         current.owner = owner_;
         current.owner_location = owner_loc;
         current.manufacturer_name = m_name;
         product_array[_id]=current;
         return 1;
         
     }
      function ask_owner_name(string _id) returns (string){
          return(product_array[_id].owner);
      }
     
     
     
     
 }