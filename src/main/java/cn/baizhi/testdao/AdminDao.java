package cn.baizhi.testdao;

import cn.baizhi.entity.Admin;


public interface AdminDao {
        //查一个
        Admin selectByName(String username);
}
