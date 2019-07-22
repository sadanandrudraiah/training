package com.cruds.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.cruds.db.StudentDAO;
import com.cruds.training.Student;

public class TextFieldDemo extends JFrame {
	
	private JTextField txtName;
	private JTextField txtRollNo;
	private JButton btnSubmit;
	private JPanel panel;

	public TextFieldDemo() {
		setTitle("Text Field Demo");
		setSize(300, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		panel = new JPanel();
		txtName = new JTextField(7);
		txtRollNo = new JTextField(5);
		btnSubmit = new JButton("Submit");
		
		btnSubmit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String name = txtName.getText();
				
				
				if(name.trim().length() == 0 || txtRollNo.getText().trim().length() == 0)
				{
					getToolkit().beep();
					JOptionPane.showMessageDialog(panel, "RollNo or Name Empty",
							"Error", JOptionPane.ERROR_MESSAGE);
					return;
				}
				int rollno = Integer.parseInt(txtRollNo.getText());
				
				StudentDAO dao = new StudentDAO();
				if(dao.create(new Student(rollno, name)))
				{
					JOptionPane.showMessageDialog(panel, "Student Created successfully",
													"Success", JOptionPane.INFORMATION_MESSAGE);
					txtName.setText("");
					txtRollNo.setText("");
				}
				
			}
		});
		
		panel.add(txtName);
		panel.add(txtRollNo);
		panel.add(btnSubmit);
		add(panel);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new TextFieldDemo();
	}
}
