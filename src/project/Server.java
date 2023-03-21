package project;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.sql.*;

public class Server extends UnicastRemoteObject implements Interface {

    Connection con;
    Statement stmt;
    ResultSet rs, rs1, rs2, rs3 ;

    public Server() throws RemoteException {
        super();
    }

    public static void main(String[] args) {

        try {
            Registry reg = LocateRegistry.createRegistry(Registry.REGISTRY_PORT);
            Server obj = new Server();
            reg.rebind("rmi://localhost/service", obj);
            System.out.println("Server Running...");
        } catch (RemoteException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public boolean login(String username, String password) throws RemoteException {
        boolean response = false;
        try {
            String host = "jdbc:derby://localhost:1527/clinic";
            String uName = "user1";
            String uPass = "user1";
            con = DriverManager.getConnection(host, uName, uPass);
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            String SQL = "SELECT * FROM register where username = '" + username + "' and passwrd = '" + password + "'";
            rs = stmt.executeQuery(SQL);

            if (rs.next()) {
                response = true;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return response;
    }

    @Override
    public String[] search(int id) {
        String response[] = new String[6];

        try {
            String host = "jdbc:derby://localhost:1527/clinic";
            String uName = "user1";
            String uPass = "user1";
            con = DriverManager.getConnection(host, uName, uPass);

            stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            String SQL = "SELECT * FROM users where id = " + id + "";
            rs1 = stmt.executeQuery(SQL);

            if (rs1.next()) {

                response[0] = rs1.getLong(1) + "";
                response[1] = rs1.getString(2) + " " + rs1.getString(3);
                response[2] = rs1.getString(5);
                response[3] = rs1.getString(4);
                response[4] = rs1.getString(7);
                response[5] = rs1.getString(8);

            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return response;
    }

    @Override
    public String[] AppointmentCheck(int id) {
        String response[] = new String[2];
        try {
            String host = "jdbc:derby://localhost:1527/clinic";
            String uName = "user1";
            String uPass = "user1";
            con = DriverManager.getConnection(host, uName, uPass);

            stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            String SQL = "SELECT * FROM users where id = " + id + "";
            rs2 = stmt.executeQuery(SQL);

            if (rs2.next()) {
                response[0] = rs2.getString(8);
                response[1] = rs2.getString(9);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return response;
    }

    @Override
    public void AddPatient(int id, String firstname, String lastname, String phone, String address, int password, String age, String doctor) {

        try {
            String host = "jdbc:derby://localhost:1527/clinic";
            String uName = "user1";
            String uPass = "user1";
            con = DriverManager.getConnection(host, uName, uPass);

            stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            String SQL = "INSERT INTO USER1.USERS (ID, FIRST_NAME, LAST_NAME, PHONE, ADDRESS, PASSWORD, AGE, DOCTOR) \n"
                    + "VALUES (" + id + ", '" + firstname + "', '" + lastname + "', '" + phone + "', '" + address + "', " + password + ", '" + age + "', '" + doctor + "')";

            int insert = stmt.executeUpdate(SQL, Statement.RETURN_GENERATED_KEYS);

        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    @Override
    public boolean DeletePatient(int id) {
        boolean response = false;
        try {
            String host = "jdbc:derby://localhost:1527/clinic";
            String uName = "user1";
            String uPass = "user1";
            con = DriverManager.getConnection(host, uName, uPass);

            stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            String SQL = "SELECT * FROM users where id = " + id + "";
            rs3 = stmt.executeQuery(SQL);

            if (rs3.next()) {
                rs3.deleteRow();
                response = true;
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return response;
    }
    
    
}
