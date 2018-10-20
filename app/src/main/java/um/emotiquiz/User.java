package um.emotiquiz;

import java.util.UUID;

public class User {
    private String uid, name;
//    id should be connected to user
//    Google authentication
//    button to login --> google API to login
//    maybe <?> timestamps for each login

    public User(){
        this.uid = UUID.randomUUID().toString();
        this.name = "new";
    }

    public String getId(){return this.uid;}
    public void setId(String id){this.uid = id;}

    public String getName(){return this.name;}
    public void setName(String n) {this.name = n;}

}
