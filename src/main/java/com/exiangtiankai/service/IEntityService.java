package com.exiangtiankai.service;

import com.exiangtiankai.common.Page;
import com.exiangtiankai.common.ResultEntity;
import com.exiangtiankai.entity.Entity;

/**
 * Created by jaseeka
 * Date 2015/8/6
 * Time 16:39
 */
public interface IEntityService {

    /**
     * 根据条件获取测试类
     * @param entity
     * @param page
     * @return
     */
    public ResultEntity getEntityList(Entity entity, Page page);
}
