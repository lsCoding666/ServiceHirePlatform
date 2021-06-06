package xyz.lsgdut.dhxt.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.lsgdut.dhxt.mapper.TbRoleMapper;
import xyz.lsgdut.dhxt.pojo.TbRole;
import xyz.lsgdut.dhxt.pojo.TbRoleExample;
import xyz.lsgdut.dhxt.service.RoleService;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    TbRoleMapper tbRoleMapper;

    @Override
    public List<TbRole> getAllRoles() {
        TbRoleExample example = new TbRoleExample();
        TbRoleExample.Criteria criteria = example.createCriteria();
        criteria.andRoleIdIsNotNull();
        List<TbRole> roles = tbRoleMapper.selectByExample(example);
        return roles;
    }

    @Override
    public TbRole getRolesById(int roleId) {
        TbRole role2 = tbRoleMapper.selectByPrimaryKey(roleId);
        return role2;
    }

    @Override
    public TbRole addRole(TbRole role) {
       int i = tbRoleMapper.insert(role);
       if (i==0){
           return null;
       }else{
           return role;
       }
    }

    @Override
    public TbRole deleteRole(TbRole role) {
        int i = tbRoleMapper.deleteByPrimaryKey(role.getRoleId());
        if (i==0){
            return null;
        }else{
            return role;
        }
    }

    @Override
    public TbRole updateRole(TbRole role) {
        int i = tbRoleMapper.updateByPrimaryKeySelective(role);
        if (i==0){
            return null;
        }else{
            return role;
        }
    }
}
