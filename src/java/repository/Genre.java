package repository;

public class Genre {
  private String name;
  private long id;
  
    public Genre() {
    }
        public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

      public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Genre(String name, long id) {
        this.name = name;
        this.id = id;
    }
   
}
