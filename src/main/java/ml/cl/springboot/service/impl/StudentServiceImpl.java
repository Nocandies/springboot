package ml.cl.springboot.service.impl;

import ml.cl.springboot.dao.StudentDao;
import ml.cl.springboot.domain.Student;
import ml.cl.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("studentService")
public class StudentServiceImpl implements StudentService {


    @Autowired
    private StudentDao studentDao;
    @Autowired
    private RedisTemplate<Object,Object> redisTemplate;
    //===============================================增========================================================
    @Transactional
    @Override
    public int addStu(Student student) {
        return studentDao.addStu(student);
    }
    //===============================================删========================================================
    @Transactional
    @Override
    public int deleteStuById(Integer id) {
        return studentDao.deleteStuById(id);
    }
    @Transactional
    @Override
    public int deleteStuByIdError(Integer id) {
        System.out.println("事务开启后异常");
        int i = studentDao.deleteStuById(id);
        int a = 8/0;
        return i;
    }
    //===============================================查========================================================
    @Override
    public List<Student> findAllStu() {
//        RedisSerializer rs = new StringRedisSerializer();
//        redisTemplate.setKeySerializer(rs);
//        List<Student> studentsList = (List<Student>) redisTemplate.opsForValue().get("allStudents");
//        // 高并发时会出现缓存穿透
//        if(null == studentsList){
//            studentsList = studentDao.findAllStu();
//            redisTemplate.opsForValue().set("allStudents",studentsList);
//        }
        List<Student> studentsList = studentDao.findAllStu();
        return studentsList;
    }

    @Override
    public Student findStuById(Integer id) {
        return studentDao.findStuById(id);
    }
    //===============================================改========================================================
    @Transactional
    @Override
    public int updateStu(Student student) {
        return studentDao.updateStu(student);
    }
}
