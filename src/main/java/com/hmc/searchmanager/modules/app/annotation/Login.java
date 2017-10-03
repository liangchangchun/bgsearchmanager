package com.hmc.searchmanager.modules.app.annotation;

import java.lang.annotation.*;

/**
 * app登录效验
 * @author liangchangchun
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Login {
}
