package org.example.sem5.cw2.control;



import org.example.sem5.cw2.View;
import org.example.sem5.cw2.model.Student;
import org.example.sem5.cw2.model.StudyGroup;
import org.example.sem5.cw2.model.Teacher;
import org.example.sem5.cw2.service.ServiceStudent;
import org.example.sem5.cw2.service.ServiceStudyGroup;
import org.example.sem5.cw2.service.ServiceTeacher;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    public Controller() {
        ServiceTeacher serviceTeacher = new ServiceTeacher();
        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(serviceTeacher.create());

        ServiceStudent serviceStudent = new ServiceStudent();
        List<Student> studentList = new ArrayList<>();
        studentList.add(serviceStudent.create());
        studentList.add(serviceStudent.create());

        ServiceStudyGroup serviceStudyGroup = new ServiceStudyGroup();
        List<StudyGroup> studyGroupList = new ArrayList<>();
        studyGroupList.add(serviceStudyGroup.create(teacherList.get(0), studentList));

        View view = new View();
        String s = view.view(studentList);
        System.out.println(s);
        s = view.view(teacherList);
        System.out.println(s);
        s = view.view(studyGroupList);
        System.out.println(s);

    }
}
