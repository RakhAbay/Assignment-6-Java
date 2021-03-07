package Subtask1;

import java.sql.*;

public class Database {

    private static Database instance; //this instance will be the only object of Database class


    Connection con = null; //this part is respnsible for database connection
    private Database() throws SQLException, ClassNotFoundException {
        Class.forName("org.postgresql.Driver");
        con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "kuka");
    };


    //this method allows to get instance named "instance"
    public static Database getInstance() throws SQLException, ClassNotFoundException {
        if (Database.instance == null) {
            instance = new Database();
        }
        return instance;
    }

    //this method allows to use queries(select...) to get needed info from students
    public void query(String sql) throws SQLException {
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);

        while (rs.next()){
            System.out.println(rs.getInt("id")+" "+rs.getString("name")+" "+rs.getString("surname")+" "+rs.getFloat("grade"));
        }

    }}

