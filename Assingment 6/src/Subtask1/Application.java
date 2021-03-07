package Subtask1;

import java.sql.SQLException;

public class Application {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Database instance1 = Database.getInstance();
        instance1.query("select id, name, surname, grade from students");

        Database instance2 = Database.getInstance();
        instance2.query("select id, name, surname, grade from students");
    } // both instance1 and instance2 reference to the same instance, so their output is the same
}
