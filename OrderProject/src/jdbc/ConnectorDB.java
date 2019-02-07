package jdbc;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletConfig;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class ConnectorDB {
    public static Connection init() throws SQLException, NamingException {
        InitialContext ic = new InitialContext();
        Context xmlContext = (Context) ic.lookup("java:comp/env");
        DataSource myDatasource = (DataSource) (xmlContext).lookup("jdbc/ORDERBASE");
        return myDatasource.getConnection();
    }
}
