package com.gameTime.GamePrefs.demo.Models;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "rustprefs")

public class RustPrefs extends GamePrefs{

    private String playStyle;
    private Integer userPlayingHours;
    private Integer minPlayingHours;
    private Integer maxPlayingHours;
    private String idealGroupSize;
    private String idealServerType;



    public Integer getUserPlayingHours() {
        return userPlayingHours;
    }

    public void setUserPlayingHours(Integer userPlayingHours) {
        this.userPlayingHours = userPlayingHours;
    }

    public Integer getMinPlayingHours() {
        return minPlayingHours;
    }

    public void setMinPlayingHours(Integer minPlayingHours) {
        this.minPlayingHours = minPlayingHours;
    }

    public Integer getMaxPlayingHours() {
        return maxPlayingHours;
    }

    public void setMaxPlayingHours(Integer maxPlayingHours) {
        this.maxPlayingHours = maxPlayingHours;
    }

    public String getIdealGroupSize() {
        return idealGroupSize;
    }

    public void setIdealGroupSize(String idealGroupSize) {
        this.idealGroupSize = idealGroupSize;
    }

    public String getIdealServerType() {
        return idealServerType;
    }

    public void setIdealServerType(String idealServerType) {
        this.idealServerType = idealServerType;
    }
    public String getPlayStyle() {
        return playStyle;
    }

    public void setPlayStyle(String playStyle) {
        this.playStyle = playStyle;
    }
    @Override
    public String toString(){
        return "Game Title " + super.getGameTitle() + "Play Style " + playStyle + "Group Size " + idealGroupSize
                + "Ideal Server Type" + idealServerType;
    }
}
