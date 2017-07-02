package com.company.project.service.impl;

import com.company.project.dao.SysRoleMapper;
import com.company.project.model.SysRole;
import com.company.project.service.SysRoleService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CuiCan on 2017/07/02.
 */
@Service
@Transactional
public class SysRoleServiceImpl extends AbstractService<SysRole> implements SysRoleService {
    @Resource
    private SysRoleMapper sysRoleMapper;

}
