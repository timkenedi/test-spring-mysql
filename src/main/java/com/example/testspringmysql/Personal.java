package com.example.testspringmysql;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Personal{




    @Id
    public String titel;
    public String lön;
    public int butik_id;
    public int personuppgifter_id;

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getLön() {
        return lön;
    }

    public void setLön(String lön) {
        this.lön = lön;
    }

    public int getButik_id() {
        return butik_id;
    }

    public void setButik_id(int butik_id) {
        this.butik_id = butik_id;
    }

    public int getPersonuppgifter_id() {
        return personuppgifter_id;
    }

    public void setPersonuppgifter_id(int personuppgifter_id) {
        this.personuppgifter_id = personuppgifter_id;
    }


}