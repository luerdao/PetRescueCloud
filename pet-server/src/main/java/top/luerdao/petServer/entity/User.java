package top.luerdao.petServer.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {
    private static final long serialVersionUID = 4831304712151465443L;
    private Long id;
    private String username;
    private String password;
    private String state;
}
