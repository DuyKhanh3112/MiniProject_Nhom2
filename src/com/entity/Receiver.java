/***********************************************************************
 * Module:  Receiver.java
 * Author:  Duy Khanh
 * Purpose: Defines the Class Receiver
 ***********************************************************************/

import java.util.*;

/** @pdOid 0f7db17e-805c-4af4-bb4a-a2b0cfcad79d */
public class Receiver {
   /** @pdOid 93106256-9d37-4499-bbed-bf9ae12315f7 */
   private int receiverID;
   /** @pdOid c06f73ef-ccfa-4e6f-8999-dac5080283c7 */
   private String receiverName;
   /** @pdOid 469c2cc3-5362-4566-b431-f8e178878719 */
   private String receiverPhone;
   /** @pdOid 998c7d75-39f5-417a-a761-ebca27763e4d */
   private String receiverAddress;
   
   /** @pdRoleInfo migr=no name=Customer assc=customerReceiver mult=1..1 */
   public Customer customer;

}