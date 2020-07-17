package com.tianyuan.WisdomTeacherServer.service.impl;

import com.tianyuan.WisdomTeacherServer.bean.SchoolClass;
import com.tianyuan.WisdomTeacherServer.mapper.SchoolClassMapper;
import com.tianyuan.WisdomTeacherServer.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassServiceImpl implements ClassService {

    @Autowired
    private SchoolClassMapper schoolClassMapper;

    /**
     * 通过ID 查询班级详情
     * @param id 班级id
     * @return
     */
    @Override
    public SchoolClass searchClass(Integer id) {
        SchoolClass schoolClass = schoolClassMapper.selectByPrimaryKey(id);
        if (schoolClass != null){
            return  schoolClass;
        }else{
            return null;
        }

    }

    /**
     * 通过学校ID 查询所属学校所有班级
     * @param schoolid 学校id
     * @param classid 班级id
     * @return
     */
    @Override
    public SchoolClass searchClassByschoolid(String schoolid, String classid) {
        SchoolClass schoolClass = schoolClassMapper.selectBySchoolOrClassid(Integer.valueOf(schoolid),Integer.valueOf(classid));
        return  schoolClass;
    }


    public boolean insertClass(SchoolClass schoolClass){
        int count = schoolClassMapper.insert(schoolClass);
        if (count > 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean updateClass(SchoolClass schoolClass){
        int count = schoolClassMapper.updateByPrimaryKeySelective(schoolClass);
        if (count > 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 删除班级
     * @param id
     * @return
     */
    public boolean deleteClass(Integer id){
        int count = schoolClassMapper.deleteByPrimaryKey(id);
        if (count > 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 查询学校所有班级
     * @param gradeId
     * @return
     */
    @Override
    public List<SchoolClass> findAll(String gradeId) {
        if(gradeId != null && !"".equals(gradeId)){
            List<SchoolClass> schoolClasses = schoolClassMapper.classList(Integer.parseInt(gradeId));
            return schoolClasses;
        }else{
            List<SchoolClass> schoolClasses = schoolClassMapper.findAll();
            return schoolClasses;
        }

    }

    /**
     * 总 条数
     * @return
     */
    @Override
    public Integer countItem() {
        Integer countItem = schoolClassMapper.countItem();
        return countItem;
    }
}
