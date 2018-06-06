package db;

import specific.User;

import java.sql.*;

public class Handler extends Configs {
    private Connection connection = null;


    public Connection getConnection() {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, user, pass);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public void signUpUser(User user) {
        String insert = "INSERT INTO " + Constans.USER_TABLE + "(" + Constans.USERS_FNAME + "," + Constans.USERS_LNAME + ","
                + Constans.USERS_USERNAME + "," + Constans.USERS_PASSWORD + "," + Constans.USERS_GENDER + ")" + "VALUES(?,?,?,?,?)";

        try {
            PreparedStatement preparedStatement = getConnection().prepareStatement(insert);
            preparedStatement.setString(1, user.getFname());
            preparedStatement.setString(2, user.getLname());
            preparedStatement.setString(3, user.getUsername());
            preparedStatement.setString(4, user.getPassword());
            preparedStatement.setString(5, user.getGender());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("prepare err(25 in Handler)");
        }
    }

    public ResultSet loginUser(User user) {
        ResultSet resultSet = null;
        String select = "SELECT * FROM " + Constans.USER_TABLE + " WHERE " + Constans.USERS_USERNAME + "=?" + "AND " + Constans.USERS_PASSWORD + "=?";

        try {
            PreparedStatement preparedStatement = getConnection().prepareStatement(select);
                preparedStatement.setString(1, user.getUsername());
                preparedStatement.setString(2, user.getPassword());

                resultSet = preparedStatement.executeQuery();


        } catch (SQLException e) {
            System.out.println("select err");
            e.printStackTrace();
        }
        return resultSet;
    }
}