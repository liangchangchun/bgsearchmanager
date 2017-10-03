package com.hmc.searchmanager.datasources;

import com.hmc.searchmanager.datasources.annotation.DataSource;
import com.hmc.searchmanager.modules.app.entity.UserEntity;
import com.hmc.searchmanager.modules.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 测试
 * @author liangchangchun
 */
@Service
public class DataSourceTestService {
    @Autowired
    private UserService userService;

    public UserEntity queryObject(Long userId){
        return userService.queryObject(userId);
    }

    @DataSource(name = DataSourceNames.SECOND)
    public UserEntity queryObject2(Long userId){
        return userService.queryObject(userId);
    }
}
