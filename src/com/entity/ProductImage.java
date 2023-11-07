/***********************************************************************
 * Module:  ProductImage.java
 * Author:  Duy Khanh
 * Purpose: Defines the Class ProductImage
 ***********************************************************************/

import java.util.*;

/** @pdOid d9b707fc-e846-4863-a5bb-89f52aee67ca */
public class ProductImage {
   /** @pdOid b39b5894-be3b-47f5-9407-cbd45d5ba7da */
   private int productImageID;
   /** @pdOid b7c363a1-05fe-4e8a-8609-de3e8e0a9f9b */
   private String productImagePath;
   
   /** @pdRoleInfo migr=no name=Product assc=productImageProduct mult=1..1 */
   public Product product;

}