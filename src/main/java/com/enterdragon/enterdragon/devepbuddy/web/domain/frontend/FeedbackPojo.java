package com.enterdragon.enterdragon.devepbuddy.backend.persistence.domain.backend;

import java.io.Serializable;

public class FeedbackPojo implements Serializable {
    private  static  final  long serialVersionUID = 1l;

    private String email;
    private String firstname;
    private String lastname;
    private String feedback;

    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public String getFirstname(){
        return firstname;
    }
    public void setFirstname(String firstname){
        this.firstname = firstname;
    }


    public String getLastname(){
        return lastname;
    }
    public void setLastname(String lastname){
        this.lastname = lastname;
    }


    public String getFeedback(){
        return feedback;
    }
    public void setFeedback(String feedback){
        this.feedback = feedback;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("feedbackPojo{");
        sb.append("email='").append(email).append('\'');
        sb.append(", firstname='").append(firstname).append('\'');
        sb.append(", lastname='").append(lastname).append('\'');
        sb.append(", email='").append(feedback).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
