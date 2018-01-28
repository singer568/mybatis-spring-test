package cn.itcast.entity;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

public interface IUserMapper {
    @Select("select * from users where id=#{id}")
    public User getById(int id);
}
