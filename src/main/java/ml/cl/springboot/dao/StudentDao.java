package ml.cl.springboot.dao;

import ml.cl.springboot.domain.Student;
import org.apache.ibatis.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface StudentDao {
    String TABLE_NAME = "student";
//    INSERT INTO table_name ( field1, field2,...fieldN ) VALUES ( value1, value2,...valueN );
    @Insert({"INSERT INTO",TABLE_NAME,
            "(name, age) VALUES (#{name}, #{age})"})
    public int addStu(Student student);
//    DELETE FROM `springboot`.`student` WHERE (`id` = '4');
    @Delete({"DELETE FROM",TABLE_NAME,"WHERE id=#{id}"})
    public int deleteStuById(int id);

    @Select({"SELECT * FROM",TABLE_NAME})
    public List<Student> findAllStu();
    @Select({"SELECT * FROM",TABLE_NAME,"WHERE id=#{id}"})
    public Student findStuById(int id);
//    UPDATE `springboot`.`student` SET `name` = '里查德' WHERE (`id` = '3');
    @Update({"UPDATE",TABLE_NAME,"SET name=#{name},age=#{age} WHERE id=#{id}"})
    public int updateStu(Student student);
}
