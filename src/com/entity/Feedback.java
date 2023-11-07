/***********************************************************************
 * Module:  Feedback.java
 * Author:  Duy Khanh
 * Purpose: Defines the Class Feedback
 ***********************************************************************/

import java.util.*;

/** @pdOid 87a06d84-8c4b-44cb-b666-ef4d19c5c113 */
public class Feedback {
   /** @pdOid 10ec76c0-279a-41ef-aeee-eb7df9971b44 */
   private int feedbackID;
   /** @pdOid 1de30a9b-4cba-4e7d-988d-d6e07dea4f6b */
   private String feedbackContent;
   /** @pdOid acb2e83a-6d8a-43d8-91cb-42fd55431481 */
   private Date feedbackDate;
   /** @pdOid dcaf5b63-8cdf-46df-822a-ee7346962f15 */
   private int feedbackStatus;
   
   /** @pdRoleInfo migr=no name=Customer assc=feedbackCustomer mult=0..1 */
   public Customer customer;
   /** @pdRoleInfo migr=no name=Product assc=feedbackProduct mult=0..1 */
   public Product product;
   /** @pdRoleInfo migr=no name=Order assc=feedbackOrder mult=0..1 */
   public Order order;

}