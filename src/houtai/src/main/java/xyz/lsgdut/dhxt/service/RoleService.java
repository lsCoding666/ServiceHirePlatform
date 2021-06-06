package xyz.lsgdut.dhxt.service;

import xyz.lsgdut.dhxt.pojo.TbRole;

import java.util.List;

public interface RoleService {

    List<TbRole> getAllRoles();

    TbRole getRolesById(int roleId);

    TbRole addRole(TbRole role);

    TbRole deleteRole(TbRole role);

    TbRole updateRole(TbRole role);


}
