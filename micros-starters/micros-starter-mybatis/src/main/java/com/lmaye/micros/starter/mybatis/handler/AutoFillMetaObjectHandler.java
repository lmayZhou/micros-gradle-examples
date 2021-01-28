package com.lmaye.micros.starter.mybatis.handler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import com.lmaye.micros.core.constants.CoreConstants;
import com.lmaye.micros.core.constants.YesOrNo;
import com.lmaye.micros.core.context.BaseContext;
import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.reflection.MetaObject;

import java.time.LocalDateTime;

/**
 * -- 自动填充公共字段
 *
 * @author lmay.Zhou
 * @date 2019/12/6 17:41 星期五
 * @email lmay@lmaye.com
 */
public class AutoFillMetaObjectHandler implements MetaObjectHandler {
    /**
     * 新增填充
     *
     * @param metaObject metaObject
     */
    @Override
    public void insertFill(MetaObject metaObject) {
        LocalDateTime now = LocalDateTime.now();
        String userName = BaseContext.getBaseInfo().getUserName();
        if(StringUtils.isNotBlank(userName)) {
            setFieldValByName("createdBy", userName, metaObject);
            setFieldValByName("lastModifiedBy", userName, metaObject);
        }
        setFieldValByName("createAt", now, metaObject);
        setFieldValByName("deleted", YesOrNo.NO.getCode(), metaObject);
        setFieldValByName("lastModifiedAt", now, metaObject);
        setFieldValByName("version", CoreConstants.VERSION, metaObject);
    }

    /**
     * 更新填充
     *
     * @param metaObject metaObject
     */
    @Override
    public void updateFill(MetaObject metaObject) {
        String userName = BaseContext.getBaseInfo().getUserName();
        if(StringUtils.isNotBlank(userName)) {
            setFieldValByName("lastModifiedBy", userName, metaObject);
        }
        setFieldValByName("lastModifiedAt", LocalDateTime.now(), metaObject);
    }
}
