package com.littleheap.Static;

import java.util.ArrayList;

import org.eclipse.ui.internal.wizards.NewWizardRegistry;

import com.littleheap.Book;

public class Information {

	//���ݿ��û���
	public static String username = "root";
	//���ݿ�����
	public static String password = "waim321123asdf";
	//���ݿ�URL��ַ
	public static String JDBC_URL = "jdbc:mysql://localhost:3306/BookManageSYS";
	//��ѯ���ݿ�ͼ���������
	public static String search_classname = "";
	//��ѯ���ݿ�ͼ���б�
	public static ArrayList<Book> bookarray = new ArrayList<Book>();
	//��ǰ����Ա
	public static String manager = "";
	//��ǰ�û�
	public static String user = "";
	//��ѯTable�б�
	public static ArrayList<String> tablearray = new ArrayList<String>();

}