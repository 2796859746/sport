package com.deyunjiaoyu.sport.dao;

import com.deyunjiaoyu.sport.bean.MainMenu;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Lenovo
 */
@Repository
public interface MenuDao {
    public List<MainMenu> getMenus();
}
