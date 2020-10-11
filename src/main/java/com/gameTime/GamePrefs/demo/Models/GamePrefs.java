package com.gameTime.GamePrefs.demo.Models;

import javax.persistence.*;


@MappedSuperclass
public class GamePrefs {
    @Id
    @GeneratedValue
    private Long id;
    private String gameTitle;



    public GamePrefs() {
    }
    public String getGameTitle() {
        return gameTitle;
    }

    public void setGameTitle(String gameTitle) {
        this.gameTitle = gameTitle;
    }

}
