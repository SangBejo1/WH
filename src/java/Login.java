/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.beans.*;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;

/**
 *
 * @author HP
 */
@ManagedBean(name="Control")
@SessionScoped
public class Login implements Serializable {
    
    private String username, password;
    private String message = "";

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
	public Login (){
            
        }
	
	
	
	public String Login() {
		
			if(username.equals("admin")&&password.equals("admin")) {
				return"header";
			}else {
				this.message = "Account is Invalid";
                                return "index";
			}
		}
		
	}
	
	
	


        
       
    
        
          

