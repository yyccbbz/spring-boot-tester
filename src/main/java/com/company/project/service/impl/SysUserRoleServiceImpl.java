package com.company.project.service.impl;

import com.company.project.dao.SysUserRoleMapper;
import com.company.project.model.SysUserRole;
import com.company.project.service.SysUserRoleService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CuiCan on 2017/07/02.
 */
@Service
@Transactional
public class SysUserRoleServiceImpl extends AbstractService<SysUserRole> implements SysUserRoleService {
    @Resource
    private SysUserRoleMapper sysUserRoleMapper;

}
