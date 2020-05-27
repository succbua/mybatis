package xyz.succbua.dao;

import xyz.succbua.domain.User;

import java.util.List;

public interface IUserDao {
    List<User> findAll(int id);
}
