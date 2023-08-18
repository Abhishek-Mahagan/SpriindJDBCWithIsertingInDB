package com.mahagan.test;

import com.mahagan.dao.ProjectDao;
import com.mahagan.domain.Project;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("application-context.xml");
        ProjectDao projectDao=applicationContext.getBean("projectDao", ProjectDao.class);
        Project project=new Project();

        project.setProjectNo(5);
        project.setTitle("Hospital management system");
        project.setDescription("MMS");
        project.setDuration(45);
        project.setStatus("Test");
        System.out.println(projectDao.insertProjects(project));
    }

}