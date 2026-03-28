package org.practice.designPatterns.creational.builderPattern;

/*
    Instead of writing multiple constructors (constructor overloading),
    you use a Builder class to set values step by step and then build the final object.
 */

class User{
    private int userId;
    private String userName;
    private String email;

    public User(int userId, String userName, String email){
        this.userId = userId;
        this.userName = userName;
        this.email = email;
    }

    public String toString(){
        return "User: " + userId + " Username: " + userName + " Email: " + email;
    }
}

class UserBuilder{
    private int userId;
    private String userName;
    private String email;

    public UserBuilder setUserId(int userId){
        this.userId = userId;
        return this;
    }

    public UserBuilder setUserName(String userName){
        this.userName = userName;
        return this;
    }

    public UserBuilder setUserEmail(String userEmail){
        this.email = userEmail;
        return this;
    }

    public User build(){
        return new User(userId, userName, email);
    }
}

class Main{
    public static void main(String[] args){
        User user1 = new UserBuilder()
                .setUserId(1)
                .setUserName("Kiran")
                .setUserEmail("juis@gmail.com")
                .build();

        System.out.println(user1);

        //normal instantiation
        User user2 = new User(1, "Kumar", "fajhl@gmail.com");
        System.out.println(user2);
    }
}