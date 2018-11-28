package io.javabrains.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service // Marks class as a Spring Business Service 
public class TopicService 
{
	private List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("spring", "Spring Framework", "Spring Famework Description","Professor Joy", "3"),
			new Topic("java", "Core Java", "Core Java Description", "Professor Zeinner", "4"),
			new Topic("javascript", "JavaScript", "JavaScript Description", "Professor Mehdi", "1")
			));
	
	public List<Topic> getAllTopics()
	{
		return topics;
	}
	
	public Topic getTopic(String id)
	{
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) 
	{	
		topics.add(topic);
	}
	
	// Iterates through topics, if topic in topics list is
	// equal to the topic requested to be edited. Edit that topic
	public void updateTopic(String id, Topic topic) 
	{
		for(int i = 0; i < topics.size(); i++)
		{
			Topic t = topics.get(i);
			if(t.getId().equals(id))
			{
				topics.set(i, topic);
				return;
			}
		}
	}

	public void deleteTopic(String id) 
	{
		topics.removeIf(t -> t.getId().equals(id));
	}
	
}
