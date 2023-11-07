/***********************************************************************
 * Module:  OrderDetails.java
 * Author:  Duy Khanh
 * Purpose: Defines the Class OrderDetails
 ***********************************************************************/

import java.util.*;

/** @pdOid e4a09a1b-cc69-405f-8ffb-aef4f1ca9fe0 */
public class OrderDetails {
   /** @pdOid 4ec7aa1f-48e7-4068-a1d2-64e14b058df0 */
   private int orderDetailsID;
   /** @pdOid b5b75bdf-2806-42f6-ae2d-6e3895e9e61e */
   private int orderDetailQuantity;
   /** @pdOid e0f2a03b-6571-48a5-968b-10130dce3cf0 */
   private Double orderDetailUnitPrice;
   /** @pdOid 4f6e4a38-0f44-4142-8e40-a2d60bf86180 */
   private float orderDetailDiscount;
   
   /** @pdRoleInfo migr=no name=Order assc=orderDetailOrder mult=1..1 */
   public Order order;
   /** @pdRoleInfo migr=no name=Product assc=orderDetailProduct mult=1..1 */
   public Product product;

}