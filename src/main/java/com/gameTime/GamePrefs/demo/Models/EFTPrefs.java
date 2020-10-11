package com.gameTime.GamePrefs.demo.Models;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "eftprefs")
public class EFTPrefs extends GamePrefs{
    private String playStyle;
    private Integer userPlayingHours;
    private Integer minPlayingHours;
    private Integer maxPlayingHours;
    private String idealGroupSize;
    private String favMap;

    @OneToOne(mappedBy = "eftPrefs")
    private User user;


    public EFTPrefs() {
    }

    public String getPlayStyle() {
        return playStyle;
    }

    public void setPlayStyle(String playStyle) {
        this.playStyle = playStyle;
    }

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

    public String getFavMap() {
        return favMap;
    }

    public void setFavMap(String favMap) {
        this.favMap = favMap;
    }
    @Override
    public String toString(){
        return "Game Title " + super.getGameTitle() + "Play Style " + playStyle + "Fav Map "
                + favMap + "Group Size " + idealGroupSize;
    }
}
