package com.in28minutes.ifstatement.examples;

public class MenuAdd {
	
	private int MenuAdd;

	MenuAdd(){
		this.MenuAdd = 0;
	}
	
	public int getMenuAdd() {
		return MenuAdd;
	}

	public void setMenuAdd(int menuAdd) {
		MenuAdd = menuAdd;
	}

	public void Add(int Number1,int Number2)
	{
		this.MenuAdd = Number1 + Number2;
	}
	
	
	public void Multiply(int Number1,int Number2)
	{
		this.MenuAdd = Number1 * Number2;
	}
	
	
}
