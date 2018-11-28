package io.javabrains.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service // Marks class as a Spring Business Service 
public class TopicService 
{
	List<Topic> topics = Arrays.asList(
			new Topic("spring", "Spring Framework", "Spring Famework Description"),
			new Topic("java", "Core Java", "Core Java Description"),
			new Topic("javascript", "JavaScript", "JavaScript Description")
			);
	
	public List<Topic> getAllTopics()
	{
		return topics;
	}
	
	public Topic getTopic(String id)
	{
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
}
