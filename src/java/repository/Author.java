
package repository;

import java.util.Date;


public class Author {
    
    public Author(){}
    
    private String fio;
    private  Date birthday;
    private long id;

  
    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Author(String fio, Date birthday, long id) {
        this.fio = fio;
        this.birthday = birthday;
        this.id = id;
    }

 
    }
