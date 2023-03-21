package project;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Interface extends Remote {

    public boolean login(String username, String password) throws RemoteException;

    public String[] search(int id) throws RemoteException;

    public String[] AppointmentCheck(int id) throws RemoteException;

    public void AddPatient(int id, String firstname, String lastname, String phone, String address, int password, String age, String doctor) throws RemoteException;

    public boolean DeletePatient(int id) throws RemoteException;
    
    
}
