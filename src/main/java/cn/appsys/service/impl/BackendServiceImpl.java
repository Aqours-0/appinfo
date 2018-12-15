package cn.appsys.service.impl;

import cn.appsys.mapper.backend.BackEndMapper;
import cn.appsys.pojo.BackendUser;
import cn.appsys.service.BackendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("backendService")
public class BackendServiceImpl implements BackendService {
    @Autowired
    private BackEndMapper backEndMapper;
    @Override
    public BackendUser endDoLogin(String code, String pwd) {
        return backEndMapper.endDoLogin(code,pwd);
    }
}
