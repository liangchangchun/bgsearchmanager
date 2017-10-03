package com.hmc.searchmanager.modules.job.dao;

import com.hmc.searchmanager.modules.job.entity.ScheduleJobEntity;
import com.hmc.searchmanager.modules.sys.dao.BaseDao;
import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

/**
 * 定时任务
 * 
 * @author liangchangchun
 */
@Mapper
public interface ScheduleJobDao extends BaseDao<ScheduleJobEntity> {
	
	/**
	 * 批量更新状态
	 */
	int updateBatch(Map<String, Object> map);
}
