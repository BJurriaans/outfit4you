/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author JuniVermeulen
 */
public class User {
      private int user_id;
      private String user_name;
      private String user_password;
      private int user_key;
      
      public User(){
      }
      
      public User(int user_id, String user_name, String user_password, int user_key){
          this.user_id = user_id;
          this.user_name = user_name;
          this.user_password = user_password;
          this.user_key = user_key;
      }

    /**
     * @return the user_id
     */
    public int getUser_id() {
        return user_id;
    }

    /**
     * @param user_id the user_id to set
     */
    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    /**
     * @return the user_name
     */
    public String getUser_name() {
        return user_name;
    }

    /**
     * @param user_name the user_name to set
     */
    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    /**
     * @return the user_password
     */
    public String getUser_password() {
        return user_password;
    }

    /**
     * @param user_password the user_password to set
     */
    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    /**
     * @return the user_key
     */
    public int getUser_key() {
        return user_key;
    }

    /**
     * @param user_key the user_key to set
     */
    public void setUser_key(int user_key) {
        this.user_key = user_key;
    }
      

}