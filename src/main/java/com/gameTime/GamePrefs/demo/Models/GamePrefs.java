package com.gameTime.GamePrefs.demo.Models;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public abstract class GamePrefs {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;


}
