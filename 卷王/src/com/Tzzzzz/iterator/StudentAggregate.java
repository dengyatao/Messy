package com.Tzzzzz.iterator;

public interface StudentAggregate {
    //添加学生
    void addStudent(Student stu);

    //删除学生
    void removeStudent(Student stu);

    //获取迭代器对象
    StudentIterator getStudentIterator();

}
