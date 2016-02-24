package myhello;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Scanner;
public interface IHello extends Remote {
    public String helloWorld() throws RemoteException;
    public String five() throws RemoteException;
    public String fivehundred() throws RemoteException;
    public String sayHelloToSomeBody(String someBodyName) throws RemoteException;
}