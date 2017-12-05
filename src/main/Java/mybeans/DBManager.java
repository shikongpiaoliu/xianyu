package mybeans;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.*;
import java.sql.Connection;
public class DBManager {
    private String driver ="com.sql.jdbc.Driver";
    private String url="jdbc:mysql://localhost:3306/yonghudenglu";
    private String user="root";
    private String password="123456";
    private Connection connection=null;
    public DBManager() {
        try {
            Class.forName(driver);
        }catch(ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public String getDriver() {
        return driver;
    }
    public void setDriver(String driver) {
        this.driver=driver;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url=url;
    }
    public String getUser() {
        return user;
    }
    public void setUser(String user) {
        this.user=user;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password=password;
    }
    public Connection getConnection() {
        try {
            if(connection==null)
                connection=DriverManager.getConnection(url,user,password);
        }catch(SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
    public void setConnection(Connection connection) {
        this.connection=connection;
    }
}
