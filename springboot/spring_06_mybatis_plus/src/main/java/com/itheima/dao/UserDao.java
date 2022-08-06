package com.itheima.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itheima.domain.User;
import org.apache.ibatis.annotations.Mapper;

//定义数据层接口与映射配置
@Mapper
public interface UserDao extends BaseMapper<User>{
}
