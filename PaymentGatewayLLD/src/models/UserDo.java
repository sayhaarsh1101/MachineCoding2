package models;

 public class UserDo {
    private String userId;
    private String firstName;
    private String email;


    public String getUserId(){
        return userId;
    }
    
    public void setUserId(String userId){
        this.userId = userId;
    }

    public String getFirstName(){
        return firstName;
    }

    public void  setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String gettEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

 }