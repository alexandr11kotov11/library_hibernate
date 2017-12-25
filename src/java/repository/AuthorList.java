package repository;

import service.Database;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AuthorList {
   
    private final ArrayList<Author> authorList = new ArrayList<>();
    
    private ArrayList<Author> getAuthors(){
    
     try {
            
            Connection conn= Database.getConnection();
            
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from author order by fio");
            while (rs.next()){
                Author author = new Author();
                author.setId(rs.getLong("id"));
                author.setFio(rs.getString("fio"));
                author.setBirthday(rs.getDate("birthday"));
                authorList.add(author);
            }
            } catch (SQLException ex) {
            Logger.getLogger(AuthorList.class.getName()).log(Level.SEVERE, null, ex);
        }
            return authorList;
    }  

public ArrayList<Author> getAuthorList(){
if(!authorList.isEmpty()){
return authorList;} 
else{
return getAuthors();
}
}}
