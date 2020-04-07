public class User {

    private long Id;
    private String name;
    private String surname;

    public User(long Id, String name, String surname){
        this.Id = Id;
        this.name = name;
        this.surname = surname;
    }

    public void setId(){
        this.Id = Id;
    }

    public long getId() {
        return Id;
    }

    public void setName(){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public void setSurname(){
        this.surname = surname;
    }

    public String getSurname(){
        return surname;
    }
}
