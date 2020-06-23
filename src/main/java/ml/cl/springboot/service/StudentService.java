package ml.cl.springboot.service;

import ml.cl.springboot.domain.Student;

import java.util.List;

public interface StudentService {
    public int addStu(Student student);
    public int deleteStuByIdError(Integer id);
    public int deleteStuById(Integer id);
    public List<Student> findAllStu();
    public Student findStuById(Integer id);
    public int updateStu(Student student);

}
