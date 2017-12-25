
package service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.DataSource;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class Database {
  
    private static Connection conn;
    private static InitialContext ic;
    private static DataSource ds;
    
    public static Connection getConnection(){
        try {
            ic = new InitialContext();
            ds = (DataSource)ic.lookup("jdbc/myLibrary");
            if (conn==null){
                conn = ds.getConnection();
            }
        } catch (SQLException | NamingException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
    
        } 
    return conn;
  
}
}
