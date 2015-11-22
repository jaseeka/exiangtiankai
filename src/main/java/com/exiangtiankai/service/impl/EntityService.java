package com.exiangtiankai.service.impl;

import com.exiangtiankai.common.Page;
import com.exiangtiankai.common.ResultCode;
import com.exiangtiankai.common.ResultEntity;
import com.exiangtiankai.dao.EntityDao;
import com.exiangtiankai.entity.Entity;
import com.exiangtiankai.service.IEntityService;
import com.github.miemiedev.mybatis.paginator.domain.PageList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by jaseeka
 * Date 2015/8/6
 * Time 15:56
 */
@Service
public class EntityService implements IEntityService {

    @Autowired
    private EntityDao entityDao;

    /**
     * 根据条件获取测试类
     * @param entity
     * @param page
     * @return
     */
    public ResultEntity getEntityList(Entity entity, Page page){
        // 结果集
        ResultEntity resultEntity = new ResultEntity();

        if (page == null){
            page = new Page();
        }

        PageList<Entity> entityPageList = entityDao.selectAndLike(entity, page.gainPageBounds());

        if (entityPageList == null || entityPageList.size() <= 0){
            resultEntity.setCode(ResultCode.FAILURE);
            resultEntity.setMsg(ResultCode.MFAILURE);
        }else {
            resultEntity.setCode(ResultCode.SUCCESS);
            resultEntity.setMsg(ResultCode.MSUCCESS);
            resultEntity.getData().put("entityList", entityPageList);
        }

        return resultEntity;
    }

}
