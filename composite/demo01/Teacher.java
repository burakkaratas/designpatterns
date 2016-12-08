
package com.karatas.composite.demo01;

import java.util.ArrayList;
import java.util.List;


public class Teacher implements ITeacher
{
	private String teacherName;
	private String deptName;
	private List <ITeacher> controls;

	public Teacher(String name, String dept)
	{
		this.teacherName = name;
		this.deptName = dept;
		this.controls = new ArrayList<>();
	}

	public void add ( Teacher teacher )
	{
		controls.add( teacher );
	}

	public void remove ( Teacher teacher )
	{
		controls.remove( teacher );
	}

	public List <ITeacher> getControllingDepts ( )
	{
		return controls;
	}

	@Override
	public String getDetails ( )
	{
		return (teacherName + " is the " + deptName);
	}
}
