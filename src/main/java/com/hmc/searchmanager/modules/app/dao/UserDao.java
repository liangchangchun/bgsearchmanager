package com.hmc.searchmanager.modules.app.dao;

import com.hmc.searchmanager.modules.app.entity.UserEntity;
import com.hmc.searchmanager.modules.sys.dao.BaseDao;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户
 * 
 * @author liangchangchun
 */
@Mapper
public interface UserDao extends BaseDao<UserEntity> {

    UserEntity queryByMobile(String mobile);
}
