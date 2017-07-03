package com.company.project.security;

import com.company.project.model.SysRole;
import com.company.project.model.SysUser;
import com.company.project.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: CuiCan
 * @Date: 2017-7-3
 * @Time: 11:41
 * @Description: 自定义UserDetailsService 接口
 */
@Service
public class CustomUserService implements UserDetailsService {

    @Autowired
    private SysUserService sysUserService;

    //重写loadUserByUsername 方法,获得 userdetails 类型用户
    @Override
    public UserDetails loadUserByUsername(String username) {

        SysUser user = sysUserService.findBy("username",username);
        if (user == null) {
            throw new UsernameNotFoundException("用户名不存在");
        }

        // 简单授权
        List<SimpleGrantedAuthority> authorities = new ArrayList<>();

        //用于添加用户的权限。只要把用户权限添加到authorities 就万事大吉。
        for (SysRole role : user.getRoles()) {
            authorities.add(new SimpleGrantedAuthority(role.getName()));
            System.out.println(role.getName());
        }
        return new org.springframework.security.core.userdetails.User(user.getUsername(),
                user.getPassword(), authorities);

    }

}
