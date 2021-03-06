package cn.lijunhaoit.myblog.mapper;
import cn.lijunhaoit.myblog.base.BaseMapper;
import cn.lijunhaoit.myblog.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper extends BaseMapper<User> {

    List<User> getUsers();
}
