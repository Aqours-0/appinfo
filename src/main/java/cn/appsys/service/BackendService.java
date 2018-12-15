package cn.appsys.service;

import cn.appsys.pojo.BackendUser;

public interface BackendService {
    BackendUser endDoLogin(String code, String pwd);

}
