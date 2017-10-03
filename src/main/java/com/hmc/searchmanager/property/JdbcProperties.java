package com.hmc.searchmanager.property;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

import com.baidu.disconf.client.common.annotations.DisconfFile;
import com.baidu.disconf.client.common.annotations.DisconfFileItem;
import com.baidu.disconf.client.common.update.IDisconfUpdate;

@Configuration
@DisconfFile(filename = "jdbc.properties")
public class JdbcProperties implements IDisconfUpdate {

    protected static final Logger LOGGER = LoggerFactory.getLogger(JdbcProperties.class);
    // 代表连接地址
    private String url;

    // 代表连接用户
    private String username;
    // 连接密码
    private String password;
    
    
    @DisconfFileItem(name = "jdbc.url", associateField = "url")
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	@DisconfFileItem(name = "jdbc.username", associateField = "username")
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	@DisconfFileItem(name = "jdbc.password", associateField = "password")
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public void reload() throws Exception {
		 LOGGER.info("url: " + url);
	}
}
