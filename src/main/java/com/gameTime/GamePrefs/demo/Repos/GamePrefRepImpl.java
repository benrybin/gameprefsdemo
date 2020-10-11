package com.gameTime.GamePrefs.demo.Repos;

import com.gameTime.GamePrefs.demo.Models.GamePrefs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GamePrefRepImpl extends JpaRepository<GamePrefs,Long> {
}
