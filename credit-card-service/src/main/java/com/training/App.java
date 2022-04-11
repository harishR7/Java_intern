package com.training;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       CreditCard card =new CreditCard(23432432L, "Harish", 6000);
       CreditCardService service= new CreditCardService();
       CreditCard card1 =new CreditCard(234L, "Hari", 7000);
       CreditCard card2 =new CreditCard(234324, "Hah", 8000);
       service.addCard(card);
       service.addCard(card1);
       service.addCard(card2);
       
       double total=0;
       for(CreditCard eachvalue: service.getCard()) {
    	   
    	
    	   if(eachvalue!=null) {
    		   total+=eachvalue.getAmountDue();
    		   System.out.println(eachvalue);
    	   }
       }
       System.out.println("Total:="+total);
    }
}
