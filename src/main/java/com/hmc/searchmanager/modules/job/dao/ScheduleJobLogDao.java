package com.hmc.searchmanager.modules.job.dao;

import com.hmc.searchmanager.modules.job.entity.ScheduleJobLogEntity;
import com.hmc.searchmanager.modules.sys.dao.BaseDao;
import org.apache.ibatis.annotations.Mapper;

/**
 * 定时任务日志
 * 
 * @author liangchangchun
 */
@Mapper
public interface ScheduleJobLogDao extends BaseDao<ScheduleJobLogEntity> {
	
}
