package ml.cl.springboot.controller;

import ml.cl.springboot.domain.Student;
import ml.cl.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/boot")
public class MybatisController {
    @Autowired
    private StudentService studentService;

    @RequestMapping("/findstu")
    public List<Student> findStu(){
        return studentService.findAllStu();
    }
    @RequestMapping("/findstu/{id}")
    public Student findStuById(@PathVariable Integer id){
        return studentService.findStuById(id);
    }
    @PostMapping("/addstu")
    public List<Student> addStu(@RequestParam("name") String name ,@RequestParam("age") Integer age){
        Student student = new Student(new Random().nextInt(),name,age);
        System.out.println(student);
        studentService.addStu(student);
        return studentService.findAllStu();
    }
    @PostMapping("/deletestu")
    public List<Student> deleteStu(@RequestParam("id") Integer id){
        studentService.deleteStuById(id);
        return studentService.findAllStu();
    }
    @PostMapping("/deletestuerror")
    public List<Student> deleteStuError(@RequestParam("id") Integer id){
        studentService.deleteStuByIdError(id);
        return studentService.findAllStu();
    }
    @PostMapping("/updatestu")
    public List<Student> updateStu(@RequestParam("id") Integer id,@RequestParam("name") String name ,@RequestParam("age") Integer age){
        Student student = new Student(id,name,age);
        System.out.println(student);
        studentService.updateStu(student);
        return studentService.findAllStu();
    }

}
