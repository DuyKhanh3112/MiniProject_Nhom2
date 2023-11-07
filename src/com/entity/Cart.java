/***********************************************************************
 * Module:  Cart.java
 * Author:  Duy Khanh
 * Purpose: Defines the Class Cart
 ***********************************************************************/

import java.util.*;

/** @pdOid 982887eb-d157-473a-9159-be3fca85f0e3 */
public class Cart {
   /** @pdOid f1482288-c5c1-4826-ae3d-70ba981c1b1e */
   private int cartID;
   /** @pdOid e26a43be-1b9b-4fc4-acb8-ae58ffd1b66d */
   private int cartQuantity;
   
   /** @pdRoleInfo migr=no name=Customer assc=customerCart mult=1..1 */
   public Customer customer;
   /** @pdRoleInfo migr=no name=Product assc=cartProduct mult=1..1 */
   public Product product;

}