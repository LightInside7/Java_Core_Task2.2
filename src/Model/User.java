package Model;

/**
 * Created by icebotari on 10/2/2017.
 */
public class User {
    int id;
    String name;

    public User(){

    }
    public User(String name, int id){
        this.name = name;
        this.id = id;
    }
    public String getName(){
        return this.name;
    }

    public int getId(){
        return this.id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setId(int id){
        this.id = id;
    }
}
