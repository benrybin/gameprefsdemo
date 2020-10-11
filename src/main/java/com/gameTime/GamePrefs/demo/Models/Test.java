package com.gameTime.GamePrefs.demo.Models;

import com.gameTime.GamePrefs.demo.Repos.GamePrefRepImpl;
import com.gameTime.GamePrefs.demo.Repos.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Test {
    @Autowired
    GamePrefRepImpl gamePrefRep;
    @Autowired
    UserRepo userRepo;
    public void setupTest(){

//        EFTPrefs eftPrefs = new EFTPrefs();
//        eftPrefs.setGameTitle("EFT");
//        eftPrefs.setPlayStyle("Rat");
//        eftPrefs.setFavMap("Customs");
//        eftPrefs.setIdealGroupSize("4");
//
//        RustPrefs rustPrefs = new RustPrefs();
//        rustPrefs.setGameTitle("Rust");
//        rustPrefs.setPlayStyle("Zerg");
//        rustPrefs.setIdealServerType("2x");
//        rustPrefs.setIdealGroupSize("2");
//        System.out.println(eftPrefs.toString());
//
//        gamePrefRep.save(eftPrefs);
//        gamePrefRep.save(rustPrefs);
        User testUser = new User();
        testUser.setUserName("Tester");
      //  testUser.getGamePrefsSet().add(gamePrefRep.findById(new Long(1)).get());
        userRepo.save(testUser);

    }
    public void printObjects(){

    }
}
