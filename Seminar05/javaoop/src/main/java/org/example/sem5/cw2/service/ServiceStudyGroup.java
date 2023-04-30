package org.example.sem5.cw2.service;



import org.example.sem5.cw2.model.Student;
import org.example.sem5.cw2.model.StudyGroup;
import org.example.sem5.cw2.model.Teacher;

import java.util.List;

public class ServiceStudyGroup {
    public StudyGroup create(Teacher teacher, List<Student> studentList) {
        return new StudyGroup(teacher, studentList);
    }
}
