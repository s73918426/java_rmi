package myhello;
import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.util.Scanner;
public class HelloServer {
    public static void main(String args[]) {
        try {
            IHello rhello = new HelloImpl();
            LocateRegistry.createRegistry(8889);
            Naming.bind("rmi://192.168.101.123:8889/RHello",rhello);
            System.out.println(">>>>>INFO:远程IHello对象绑定成功！");
        } catch (RemoteException e) {
            System.out.println("创建远程对象发生异常！");
            e.printStackTrace();
        } catch (AlreadyBoundException e) {
            System.out.println("发生重复绑定对象异常！");
            e.printStackTrace();
        } catch (MalformedURLException e) {
            System.out.println("发生URL畸形异常！");
            e.printStackTrace();
        }
        int i=0;
    	Scanner scanner = new Scanner(System.in);
    	while (scanner.hasNextLine()) {
    		String number=scanner.nextLine();
    		HelloImpl.number=number;
    		i++;
    		if(i==4)
    			i=0;
    	}

    }
}