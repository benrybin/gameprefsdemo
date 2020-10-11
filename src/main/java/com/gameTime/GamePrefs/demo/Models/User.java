package com.gameTime.GamePrefs.demo.Models;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue
    private Long id;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "eftprefs_id",referencedColumnName = "id")
    private EFTPrefs eftPrefs;


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }



    private String userName;





}
