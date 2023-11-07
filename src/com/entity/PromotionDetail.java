/***********************************************************************
 * Module:  PromotionDetail.java
 * Author:  Duy Khanh
 * Purpose: Defines the Class PromotionDetail
 ***********************************************************************/

import java.util.*;

/** @pdOid 2e8e30f1-79a7-4e6f-9c99-967fde4a6a85 */
public class PromotionDetail {
   /** @pdOid d298a6aa-b6a2-4fbc-ac65-3d2f3bc69b7c */
   private int promotionDetailID;
   /** @pdOid 5d446d2b-b846-468f-b769-0a1b0f9c6e02 */
   private float promotionDetailDiscount;
   
   /** @pdRoleInfo migr=no name=Product assc=promotionDetailProduct mult=1..1 */
   public Product product;
   /** @pdRoleInfo migr=no name=Promotion assc=promotionDetailPromotion mult=1..1 */
   public Promotion promotion;

}