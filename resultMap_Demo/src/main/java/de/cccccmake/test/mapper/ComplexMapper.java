package de.cccccmake.test.mapper;

import de.cccccmake.test.pojo.SysUser;

import java.util.List;

public interface ComplexMapper {
    List<SysUser> getUserList(int sex);
}
