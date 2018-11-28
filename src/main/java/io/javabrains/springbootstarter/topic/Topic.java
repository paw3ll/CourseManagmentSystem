package io.javabrains.springbootstarter.topic;

public class Topic 
{
	private String id;
	private String name;
	private String description;
	private String professor;
	private String creditHours;
	
	// Constructors.
	public Topic() 
	{
		
	}
	
	public Topic(String id, String name, String description, String professor, String creditHours) 
	{
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.professor = professor;
		this.creditHours = creditHours;
		
	}

	// Getters and Setters.
	public void setId(String id) 
	{
		this.id = id;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public void setDescription(String description) 
	{
		this.description = description;
	}
	
	public String getId() 
	{
		return id;
	}
	
	public String getName() 
	{
		return name;
	}
	
	public String getDescription() 
	{
		return description;
	}

	public String getProfessor() 
	{
		return professor;
	}

	public void setProfessor(String professor) 
	{
		this.professor = professor;
	}

	public String getCreditHours() 
	{
		return creditHours;
	}

	public void setCreditHours(String creditHours) 
	{
		this.creditHours = creditHours;
	}

}
