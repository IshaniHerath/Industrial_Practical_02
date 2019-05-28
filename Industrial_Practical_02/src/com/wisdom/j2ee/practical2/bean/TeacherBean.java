package com.wisdom.j2ee.practical2.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import com.wisdom.j2ee.practical2.pojo.Teacher;

@ManagedBean(name = "teacherBean")
@ViewScoped
public class TeacherBean {
	
	private Teacher teacher = new Teacher();
	private static List<Teacher> teachers = new ArrayList<Teacher>(0);
	private List<Teacher> selectedTeachers = new ArrayList<Teacher>(0);

	public void submit() {
		System.out.println("Execute Submit Operation");
		try {
			System.out.println(teacher);
			teachers.add(getTeacher());
			reset();
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_INFO, "", "Create Success..."));
		} catch (Exception e) {
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "", "Create Fail..."));
		}
	}

	

	private void reset() {
		teacher = new Teacher();
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public List<Teacher> getTeachers() {
		return teachers;
	}

	public void setTeachers(List<Teacher> teachers) {
		this.teachers = teachers;
	}

	public List<Teacher> getSelectedTeachers() {
		return selectedTeachers;
	}

	public void setSelectedTeachers(List<Teacher> selectedTeachers) {
		this.selectedTeachers = selectedTeachers;
	}
}
