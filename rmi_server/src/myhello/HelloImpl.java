package myhello;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Scanner;
public class HelloImpl extends UnicastRemoteObject implements IHello {
    private static final long serialVersionUID = 1L;
    public HelloImpl() throws RemoteException {
    }
    
    
    static String number="";
	public String helloWorld() throws RemoteException {
		return number;
	}  
	public String five() throws RemoteException {
		// TODO Auto-generated method stub
		int num = (int)(Math.random()*10000+1);
		String str = Integer.toString(num);
		return str;
	}
	public String fivehundred() throws RemoteException {
		// TODO Auto-generated method stub
		int num = (int)(Math.random()*10000+1);
		String str = Integer.toString(num);
		return str;
	}
	public String sayHelloToSomeBody(String someBodyName) throws RemoteException {
		System.out.println(someBodyName);
    	return someBodyName;
    }

}

