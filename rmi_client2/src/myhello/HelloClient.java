package myhello;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Timer;

public class HelloClient {
    public static void main(String args[]) throws InterruptedException{
    	String now="";
    	String []value5=new String[5];
    	String []value500=new String[500];
    	System.out.println("hello");
        try {
        	while(true){
            IHello rhello =(IHello) Naming.lookup("rmi://192.168.101.123:8889/RHello");
            String ing=rhello.helloWorld();
           // System.out.println(rhello.five());
	            if(!ing.equals(now) && !ing.equals("")){
	            	now=ing;
	            	
	            	
	        	    for (int i=0; i<5; i++) {
	        	        value5[i]=rhello.five();
	        	        System.out.println(value5[i]);
	        	    }
	        	    System.out.println("5�ո��X");
	        	    
	            	for(int i=0;i<500;i++){
	            		value500[i]=rhello.fivehundred();
	            	}
	            	
	            	
	            	for(int i=0;i<500;i++){
	            		for (int i2=0; i2<5; i2++) {
		        	        if(value500[i].equals(value5[i2])){
		        	        	System.out.println(rhello.sayHelloToSomeBody(value500[i]+"����"));
		        	        }
		        	    }
	            		//System.out.println(i);
	            	}
	            	System.out.println("����");
	            }
        	}
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace(); 
        }
    }
}