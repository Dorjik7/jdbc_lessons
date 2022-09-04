package org.example;
import java.sql.*;


public class Main {
    private final static String url = "jdbc:mysql://localhost:3306/dbtest";
    private final static String user = "root";
    private final static String passwd = "root";

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(url, user, passwd)) {
            Statement statement = connection.createStatement();
            //System.out.println(connection.isClosed());
         //   statement.execute("INSERT INTO users(name, age, email) VALUES('Mark', 34,'mark@mail.ru');"); добавить данные в таблицу
            //   int res = statement.executeUpdate("UPDATE users SET age = 45 WHERE id=6");  замена данных в таблице
            // System.out.println(res);
           // ResultSet res = statement.executeQuery("SELECT * FROM users"); вывод данные

            // пакетная отправка запросов
            // statement.addBatch("INSERT INTO users(name, age, email) VALUES('Donn', 14,'donn@mail.ru');");
            //  statement.addBatch("INSERT INTO users(name, age, email) VALUES('Bidon', 99,'bidon@mail.ru');");
            // statement.addBatch("INSERT INTO users(name, age, email) VALUES('Ava', 23,'ava@mail.ru');");
            // statement.executeBatch();

            //statement.clearBatch();           затирает старые запросы

           // boolean status = statement.isClosed(); метод, проверяет закрыто ли соединение
           // System.out.println(status);
           // statement.getConnection(); получаем соединение
            // statement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


