package dk.via.Tier2;


import dk.via.Tier2.Controller.RMIServer;

import java.rmi.RemoteException;

public class Tier2Main {

    private static final long serialVersionUID = 1L;

    public static void main(String[] args) {

        //      System.setProperty("java.rmi.server.hostname", "127.0.0.1/RmiService");

        try {
            RMIServer rmiServer = new RMIServer();
            rmiServer.StartRMI(1099);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
