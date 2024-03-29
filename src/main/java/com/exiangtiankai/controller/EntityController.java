package com.exiangtiankai.controller;

import com.common.utils.JsonUtils;
import com.exiangtiankai.common.ResultEntity;
import com.exiangtiankai.entity.Entity;
import com.exiangtiankai.service.IEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by jaseeka
 * Date 2015/8/6
 * Time 16:07
 */
@Controller
@RequestMapping
public class EntityController {

    @Autowired
    private IEntityService entityService;

    @RequestMapping(value = "/getEntity", produces = "application/json;charset=UTF-8")
    @ResponseBody
    public String getEntity(
            Entity model,
            HttpSession session,
            HttpServletRequest request,
            HttpServletResponse response
    ){
        ResultEntity resultEntity = entityService.getEntityList(model, null);

        return JsonUtils.Object2Json(resultEntity);
    }
}
