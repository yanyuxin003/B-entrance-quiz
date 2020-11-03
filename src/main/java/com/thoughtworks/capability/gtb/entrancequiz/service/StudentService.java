package com.thoughtworks.capability.gtb.entrancequiz.service;

import com.thoughtworks.capability.gtb.entrancequiz.domain.Group;
import com.thoughtworks.capability.gtb.entrancequiz.domain.Student;
// TODO GTB-工程实践: - 未使用的import语句
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.apache.commons.*;
import sun.misc.IOUtils;


import java.nio.charset.Charset;
import java.util.*;

@Service
public class StudentService {

    // TODO GTB-知识点: - 应该使用Repository层保存数据
    List<Student> students;
    String[] studentName = {
           "成吉思汗","鲁班七号","太乙真人","钟无艳","花木兰","雅典娜","芈月","白起",
           "刘婵","庄周","马超","刘备","哪吒","大乔","蔡文姬"
    };
   List<Group> groups;
    // TODO GTB-工程实践: - Magic Number
   int groupSize = 6 ;

    public ResponseEntity<List<Student>> getStudents() {
        students = new ArrayList<>();
        // TODO GTB-知识点: - 以下代码可以使用Java8 Stream简化
        for (int i = 1; i <= 15; i++) {
            Student student = new Student(i,studentName[i]);
            students.add(student);
        }
        return ResponseEntity.ok(students);
    }

    // TODO GTB-完成度: - 分组功能实现错误
    public ResponseEntity<List<Group>> getGroups(){
        // TODO GTB-知识点: - 打乱顺序可以了解下Collections.shuffle()
        int index=(int)(Math.random()*students.size());
        Student student =students.get(index);
        List<Student> studentToGroup = new ArrayList<>();
        studentToGroup.add(student);
        if(students.size()>0){
            for (int i = 1; i <= groupSize ; i++) {
                Group group = new Group((i+"组"),studentToGroup);
                students.remove(student);
            }
        }
        return  ResponseEntity.ok(groups);
    }

    public ResponseEntity addStudent(Student student) {
        students.add(student);
        return ResponseEntity.ok(students);
    }
}
