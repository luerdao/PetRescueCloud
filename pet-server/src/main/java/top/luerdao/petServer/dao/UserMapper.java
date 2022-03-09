package top.luerdao.petServer.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import top.luerdao.petServer.entity.User;

import java.util.List;

@Mapper
public interface UserMapper extends BaseMapper<User> {
    /**
     * 基于用户名获取用户信息
     * @param username
     * @return
     */
    @Select("select id,username,password,state " +
            "from user " +
            "where username=#{username}")
    User selectUserByUsername(String username);

    /**
     * 基于用户id查询用户权限
     * @param userId 用户id
     * @return 用户的权限
     * 涉及到的表:tb_user_roles,tb_role_menus,tb_menus
     */
    @Select("select distinct ur.menu " +
            "from user u join user_role ur on ur.user_id=u.id " +
            "where u.id=#{userId}")
    List<String> selectUserPermissions(Long userId);

}
