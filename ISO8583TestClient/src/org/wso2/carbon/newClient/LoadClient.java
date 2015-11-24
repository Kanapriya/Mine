package org.wso2.carbon.newClient;

public class LoadClient extends Thread{
	public static void main(String args[]) {
		new Thread(new loadMessage()).start();
		new Thread(new loadMessage1()).start();
		new Thread(new loadMessage2()).start();
		new Thread(new loadMessage3()).start();
    }
}
