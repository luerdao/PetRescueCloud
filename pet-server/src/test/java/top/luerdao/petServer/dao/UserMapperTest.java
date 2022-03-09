package top.luerdao.petServer.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @org.junit.jupiter.api.Test
    void selectUserByUsername() {
        System.out.println(userMapper);
        System.out.println(userMapper.selectUserByUsername("aaa"));
    }

    @org.junit.jupiter.api.Test
    void selectUserPermissions() {
        System.out.println(userMapper.selectUserPermissions(2L));
    }
}