import java.util.*;

public class Users {
    int id;
    String name;
    String password;
    int points;
    String[] giftCards ={ "Amazon","Flipkart","Ebay"};

    public Users(int id, String name,String password,int points){
        this.id=id;
        this.name=name;
        this.password=password;
        this.points=points;

    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }



}
