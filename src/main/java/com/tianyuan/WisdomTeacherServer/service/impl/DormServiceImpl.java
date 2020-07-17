package com.tianyuan.WisdomTeacherServer.service.impl;

import com.tianyuan.WisdomTeacherServer.bean.SchoolDorm;
import com.tianyuan.WisdomTeacherServer.mapper.SchoolDormMapper;
import com.tianyuan.WisdomTeacherServer.service.DormService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DormServiceImpl implements DormService {

    @Autowired
    private SchoolDormMapper schoolDormMapper;

    /**
     * 通过id查询寝室
     * @param id 寝室id
     * @return
     */
    @Override
    public SchoolDorm searchSchoolDorm(Integer id) {
        if (!"".equals(id)){
            SchoolDorm schoolDorm = schoolDormMapper.selectByPrimaryKey(id);
            return schoolDorm;
        }else {
            return null;
        }
    }

    /**
     * 添加寝室
     * @param schoolDorm 寝室类
     * @return
     */
    @Override
    public boolean insertDorm(SchoolDorm schoolDorm) {
        int count = schoolDormMapper.insertSelective(schoolDorm);
        if ( count > 0 ){
            return true;
        }else{
            return false;
        }
    }

    /**
     * 修改寝室
     * @param schoolDorm 寝室类
     * @return
     */
    @Override
    public boolean updateDorm(SchoolDorm schoolDorm) {
        int count = schoolDormMapper.updateByPrimaryKeySelective(schoolDorm);
        if ( count > 0 ){
            return true;
        }else{
            return false;
        }
    }

    /**
     * 通过主键ID删除寝室
     * @param id  寝室id
     * @return
     */
    @Override
    public boolean deleteDorm(Integer id) {
        int count = schoolDormMapper.deleteByPrimaryKey(id);
        if ( count > 0 ){
            return  true;
        }else{
            return false;
        }
    }

    /**
     * 查询学校所有寝室
     * @return
     */
    @Override
    public List<SchoolDorm> findAll() {
        List<SchoolDorm> schoolDorms = schoolDormMapper.findAll();
        return  schoolDorms;
    }

    /**
     * 总条数
     * @return
     */
    @Override
    public Integer countItem() {
        Integer countItem = schoolDormMapper.countItem();
        return countItem;
    }
}
