package com.exercise27mvchelloworld.model;

public class UserBean {
	private byte edad;
	private String nombre;
	private int id;
	
	public UserBean() {}
	
	public UserBean(int id)
	{
		this.id = id;
		this.nombre = "";
		this.edad = 0;
	}
	
	public UserBean(int id, String nombre, byte edad)
	{
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public byte getEdad()
	{
		return edad;
	}
	
	public void setEdad(byte edad)
	{
		this.edad = edad;
	}
	
	public String getNombre()
	{
		return nombre;
	}
	
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	
	public int getId()
	{
		return id;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
}
