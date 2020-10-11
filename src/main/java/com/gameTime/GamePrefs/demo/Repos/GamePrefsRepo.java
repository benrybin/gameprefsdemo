package com.gameTime.GamePrefs.demo.Repos;

import com.gameTime.GamePrefs.demo.Models.GamePrefs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

@NoRepositoryBean
public interface GamePrefsRepo<T extends GamePrefs, ID extends Serializable> extends JpaRepository<T,ID> {

    

}
