package com.hwtechservicesllc.jcg.moreongettersandsetters;

import javax.swing.*;
import java.awt.*;

class EmployeeUI extends JPanel implements Employee.Exporter
{	private JLabel nameWidget   = new JLabel("");
	private JLabel idWidget     = new JLabel("");
	private JLabel salaryWidget = new JLabel("");

	public void addName	 ( String name   ) { nameWidget.setText(name);   }
	public void addID	 ( String id 	 ) { idWidget.setText(id); 	 }
	public void addSalary( String salary ) { salaryWidget.setText(salary); }

	public EmployeeUI()
	{	setLayout( new GridLayout(3,2) );
		add( new JLabel("Name:  ") );
		add( nameWidget );
		add( new JLabel("Employee ID:  ") );
		add( idWidget );
		add( new JLabel("Salary:  ") );
		add( salaryWidget );
	}
}
