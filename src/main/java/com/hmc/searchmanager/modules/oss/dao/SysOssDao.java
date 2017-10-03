package com.hmc.searchmanager.modules.oss.dao;

import com.hmc.searchmanager.modules.oss.entity.SysOssEntity;
import com.hmc.searchmanager.modules.sys.dao.BaseDao;
import org.apache.ibatis.annotations.Mapper;

/**
 * 文件上传
 * 
 * @author liangchangchun
 */
@Mapper
public interface SysOssDao extends BaseDao<SysOssEntity> {
	
}
