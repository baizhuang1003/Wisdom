package com.tianyuan.WisdomTeacherServer.controller;

import com.tianyuan.WisdomTeacherServer.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    private IUserService userService;

    /*@RequestMapping(value = "/test", method = RequestMethod.GET)
    public SchoolStudent A() {
        SchoolStudent schoolStudent = userService.searchStudent();
        return schoolStudent;
    }

    @RequestMapping(value = "/test2", method = RequestMethod.PUT)
    public boolean B(@RequestBody SchoolStudent schoolStudent) {
        boolean b = userService.updateStudent(schoolStudent);
        return b;
    }

    //登录
    @PostMapping("/login")
    @LoginToken
    public Object login(@RequestBody User user) {
        JSONObject jsonObject = new JSONObject();
        user.setId("1");
        user.setUserName("AAAA");
        user.setPwd("123123");
        String token = JwtUtil.createJWT(6000000, user);
        jsonObject.put("token", token);
        jsonObject.put("user", user);
        return jsonObject;
    }

    //查看个人信息
    @CheckToken
    @GetMapping("/getMessage")
    public String getMessage() {
        return "你已通过验证";
    }

    /*@GetMapping("/searchSchoolStudents/{currentPage}/{pageSize}")
    public PageBean<SchoolStudent> searchSchoolStudents(@PathVariable("currentPage") String currentPage, @PathVariable("pageSize") String pageSize) {
        PageHelper.startPage(Integer.parseInt(currentPage), Integer.parseInt(pageSize));
        List<SchoolStudent> allItems = userService.findAll();
        int countNums = userService.countItem();
        PageBean<SchoolStudent> pageData = new PageBean<>(Integer.parseInt(currentPage), Integer.parseInt(pageSize), countNums);
        pageData.setItems(allItems);
        return pageData;
    }*/
}
