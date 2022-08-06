package com.itheima.dao;

import com.itheima.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

//定义数据层接口与映射配置
@Mapper
public interface UserDao {
    @Select("select * from tb_user where id = #{id}")
    public User getById(Integer id);
}
