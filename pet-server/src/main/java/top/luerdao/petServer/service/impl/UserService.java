package top.luerdao.petServer.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.luerdao.petServer.dao.UserMapper;
import top.luerdao.petServer.entity.User;

import java.util.List;

@Service
public class UserService implements top.luerdao.petServer.service.UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public User selectUserByUsername(String username) {
        return userMapper.selectUserByUsername(username);
    }
    @Override
    public List<String> selectUserPermissions(Long userId) {
        return userMapper.selectUserPermissions(userId);
    }

}
