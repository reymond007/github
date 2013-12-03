package cn.edu.seu.service;

import java.util.List;

import cn.edu.seu.pojo.SelectCondition;
import cn.edu.seu.pojo.User;

public interface UserService {
int login(User user);
List selectInfo(SelectCondition selectCondition);
}
