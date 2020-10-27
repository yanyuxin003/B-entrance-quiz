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
    public ResponseEntity<Set<Group>> getrGroupList(){
        return studentService.getGroups();
    }

    @PostMapping("/student")
    @CrossOrigin
    public ResponseEntity addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
}

}
