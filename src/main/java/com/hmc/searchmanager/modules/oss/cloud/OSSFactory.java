package com.hmc.searchmanager.modules.oss.cloud;

import com.hmc.searchmanager.modules.sys.service.SysConfigService;
import com.hmc.searchmanager.common.utils.ConfigConstant;
import com.hmc.searchmanager.common.utils.Constant;
import com.hmc.searchmanager.common.utils.SpringContextUtils;

/**
 * 文件上传Factory
 * @author liangchangchun
 */
public final class OSSFactory {
    private static SysConfigService sysConfigService;

    static {
        OSSFactory.sysConfigService = (SysConfigService) SpringContextUtils.getBean("sysConfigService");
    }

    public static CloudStorageService build(){
        //获取云存储配置信息
        CloudStorageConfig config = sysConfigService.getConfigObject(ConfigConstant.CLOUD_STORAGE_CONFIG_KEY, CloudStorageConfig.class);

        if(config.getType() == Constant.CloudService.QINIU.getValue()){
            return new QiniuCloudStorageService(config);
        }else if(config.getType() == Constant.CloudService.ALIYUN.getValue()){
            return new AliyunCloudStorageService(config);
        }else if(config.getType() == Constant.CloudService.QCLOUD.getValue()){
            return new QcloudCloudStorageService(config);
        }

        return null;
    }

}
