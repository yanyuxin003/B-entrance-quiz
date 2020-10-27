package com.thoughtworks.capability.gtb.entrancequiz.service;

import com.thoughtworks.capability.gtb.entrancequiz.domain.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.apache.commons.*;
import sun.misc.IOUtils;


import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class StudentService {

    List<Student> students;
   String[] studentName = {
           "成吉思汗","鲁班七号","太乙真人","钟无艳","花木兰","雅典娜","芈月","白起",
           "刘婵","庄周","马超","刘备","哪吒","大乔","蔡文姬"
   };

    public ResponseEntity<List<Student>> getStudents() {
        students = new ArrayList<>();
        for (int i = 1; i <= 15; i++) {
            Student student = new Student(i,studentName[i]);
            students.add(student);
        }
        return ResponseEntity.ok(students);
    }


}
