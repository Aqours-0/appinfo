package cn.appsys.mapper.backend;

import cn.appsys.pojo.BackendUser;
import org.apache.ibatis.annotations.Param;

public interface BackEndMapper {
    BackendUser endDoLogin(@Param("code") String code,@Param("pwd") String pwd);
}
