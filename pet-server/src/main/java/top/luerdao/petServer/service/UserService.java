package top.luerdao.petServer.service;

import top.luerdao.petServer.entity.User;

import java.util.List;

public interface UserService {
    User selectUserByUsername(String username);
    List<String> selectUserPermissions(Long userId);
}
