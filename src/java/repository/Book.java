package repository;

import service.Database;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Book implements Serializable {
   
  private long id;  
  private String name;
  private byte [] content;
  private int page_count;
    private String isbn;
    private String genre;
    private String author;
    private int publish_year;
    private String publisher;
    private byte[] image;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

      public byte[] getContent() {
        return content;
    }

     public void setContent(byte[] content) {
        this.content = content;
    }

    public int getPage_count() {
        return page_count;
    }

    public void setPage_count(int page_count) {
        this.page_count = page_count;
    }

       public String getIsbn() {
        return isbn;
    }

      public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

        public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

     public int getPublish_year() {
        return publish_year;
    }

       public void setPublish_year(int publish_year) {
        this.publish_year = publish_year;
    }

        public long getId() {
        return id;
    }

     public void setId(long id) {
        this.id = id;
    }
     
     public void fillPdfContent(){   
      
          Statement stmt = null;
          Connection conn = null;
          ResultSet rs = null;
          try {
          conn = Database.getConnection();
          stmt = conn.createStatement();
          rs = stmt.executeQuery("select content from book where id = " +this.getId());
          
          while (rs.next()){
              this.setContent(rs.getBytes("content"));
          }
          
      } catch (SQLException ex) {
          Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
      } finally{
               try{
             if (stmt != null){
                 stmt.close();
             }
              if (rs != null){
                 rs.close();
             }
              if (conn != null){
                 conn.close();
         }
     }  catch (SQLException ex) {
            Logger.getLogger(BookList.class.getName()).log(Level.SEVERE, null, ex);
        }}
           
    }  
          }
     
        
        
     
   

