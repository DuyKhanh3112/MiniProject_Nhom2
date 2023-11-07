/***********************************************************************
 * Module:  Order.java
 * Author:  Duy Khanh
 * Purpose: Defines the Class Order
 ***********************************************************************/

import java.util.*;

/** @pdOid 8d9b26ba-1bd3-4e74-92c1-765ffa21baf0 */
public class Order {
   /** @pdOid e8da9f4a-f6a1-4e0c-92bd-1a967ad617a3 */
   private int orderID;
   /** @pdOid 04f638e4-8fc1-48b3-b5c6-d13609c1770c */
   private Date orderDate;
   /** @pdOid 38a2d751-f772-4322-950d-0433b1382e6e */
   private Date orderDeliveryDate;
   /** @pdOid 74054e6f-e79b-4df7-8475-85523020699f */
   private Double orderTotal;
   /** @pdOid 7b422fbc-7cf6-4674-8d69-59e85c404647 */
   private String orderNote;
   /** @pdOid 56179798-c6be-4cdd-965a-d7b19a72caa5 */
   private int orderStatus;
   
   /** @pdRoleInfo migr=no name=Receiver assc=orderReceiver mult=1..1 */
   public Receiver receiver;
   /** @pdRoleInfo migr=no name=Employee assc=employeeOrder mult=1..1 */
   public Employee employee;

}