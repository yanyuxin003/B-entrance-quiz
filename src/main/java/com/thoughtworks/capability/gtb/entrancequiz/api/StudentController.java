package com.thoughtworks.capability.gtb.entrancequiz.api;

import com.thoughtworks.capability.gtb.entrancequiz.domain.Group;
import com.thoughtworks.capability.gtb.entrancequiz.domain.Student;
import com.thoughtworks.capability.gtb.entrancequiz.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
public class StudentController {

    // TODO GTB-知识点: - 推荐使用构造器注入
    // TODO GTB-工程实践: - 违反了封装性，字段应该使用private
    @Autowired
    StudentService studentService;

    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    @GetMapping("/students")
    public ResponseEntity<List<Student>> getStudentList(){
        return studentService.getStudents();
    }

    @GetMapping("/groups")
    // TODO GTB-工程实践: - 拼写错误
    // TODO GTB-知识点: - 违反Restful实践, 创建资源的请求应该使用POST
    public ResponseEntity<List<Group>> getrGroupList(){
        return studentService.getGroups();
    }

    // TODO GTB-知识点: - 违反Restful实践, url不合理
    @PostMapping("/student")
    // TODO GTB-知识点: - @CrossOrigin可以放在类上
    @CrossOrigin
    // TODO GTB-知识点: - 没有使用泛型
    // TODO GTB-知识点: - 违反Restful实践, Post请求成功后应该返回201
    // TODO GTB-知识点: - ResponseEntity不应该侵入到Service层
    public ResponseEntity addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
}

}
