package project;

public class Client {

    public static Login login = new Login();
    public static Home home = new Home();
    public static Add_Info add_info = new Add_Info();
    public static ShowDetail show = new ShowDetail();
    public static Resrvation resrvation = new Resrvation();
    public static Delete delete = new Delete();

    public static void main(String[] args) {

        login.setVisible(true);
        login.setTitle("Login");
        login.setResizable(false);

        home.setVisible(false);
        home.setTitle("Home");
        home.setResizable(false);

        add_info.setVisible(false);
        add_info.setTitle("Add Patient");
        add_info.setResizable(false);

        show.setVisible(false);
        show.setTitle("Show Patient Info");
        show.setResizable(false);

        resrvation.setVisible(false);
        resrvation.setTitle("Reservation");
        resrvation.setResizable(false);

        delete.setVisible(false);
        delete.setTitle("Delete Patient");
        delete.setResizable(false);


    }
}
