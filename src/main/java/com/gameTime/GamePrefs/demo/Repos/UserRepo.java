package com.gameTime.GamePrefs.demo.Repos;

import com.gameTime.GamePrefs.demo.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User,Long> {

}
