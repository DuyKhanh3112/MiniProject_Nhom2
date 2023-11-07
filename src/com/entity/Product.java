/***********************************************************************
 * Module:  Product.java
 * Author:  Duy Khanh
 * Purpose: Defines the Class Product
 ***********************************************************************/

import java.util.*;

/** @pdOid 2892512a-792a-46f1-959d-be8f72aabc54 */
public class Product {
   /** @pdOid d3a5f5cb-cf19-4066-a71d-80470e609069 */
   private int productID;
   /** @pdOid e7939b8b-293a-4a59-a6df-076071683716 */
   private String productName;
   /** @pdOid d160f33e-1ef9-4bb2-937a-f553bb3e2c19 */
   private int productQuantity;
   /** @pdOid f865cfdc-57c6-4c6f-9cfc-8e96b42c0a50 */
   private Date productExpiryDate;
   /** @pdOid c34881de-18db-41cf-9267-747823e2a599 */
   private Double productImportPrice;
   /** @pdOid d87025ca-2050-4b60-90ed-ad37b7523560 */
   private Double productUnitPrice;
   /** @pdOid 8cdce579-c43e-47a0-8584-77387a79fac5 */
   private String productDescription;
   /** @pdOid f3d454fe-019b-4f3f-89b7-4547fa713d9e */
   private int productStatus;
   
   /** @pdRoleInfo migr=no name=Supplier assc=productSupplier mult=0..1 */
   public Supplier supplier;
   /** @pdRoleInfo migr=no name=Category assc=productCategory mult=1..1 */
   public Category category;

}