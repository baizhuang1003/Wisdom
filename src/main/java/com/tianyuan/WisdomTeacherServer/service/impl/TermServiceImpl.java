package com.tianyuan.WisdomTeacherServer.service.impl;

import com.tianyuan.WisdomTeacherServer.bean.RegionProvince;
import com.tianyuan.WisdomTeacherServer.bean.SchoolTerm;
import com.tianyuan.WisdomTeacherServer.mapper.SchoolTermMapper;
import com.tianyuan.WisdomTeacherServer.service.TermService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.PrivateKey;
import java.util.List;

@Service
public class TermServiceImpl implements TermService {
    @Autowired
    private SchoolTermMapper schoolTermMapper;


    @Override
    public boolean insertTerm(SchoolTerm schoolTerm) {
        int count = schoolTermMapper.insertSelective(schoolTerm);
        if (count > 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean updateTerm(SchoolTerm schoolTerm) {
        int count =schoolTermMapper.updateByPrimaryKeySelective(schoolTerm);
        if (count > 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean deleteTerm(Integer id) {
        int count = schoolTermMapper.deleteByPrimaryKey(id);
        if (count > 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public List<SchoolTerm> findAll() {
        List<SchoolTerm> all = schoolTermMapper.findAll();
        return all;
    }

    @Override
    public Integer countItem() {
        int count =schoolTermMapper.countItem();
        if (!"".equals(count)){
            return count;
        }else {
            return null;
        }
    }
    /*@Autowired
    private SchoolTerm*/
}
