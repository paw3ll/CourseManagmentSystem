package io.javabrains.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController 
{
	@Autowired
	private TopicService topicService;
	
	// Below is a GET request to the API.
	@RequestMapping("/topics")
	public List<Topic> getAllTopics()
	{
		return topicService.getAllTopics();
				
	}
	
	// Below is a GET request to the API.
	@RequestMapping("/topics/{id}")
	public Topic getTopic(@PathVariable String id)
	{
		return topicService.getTopic(id);
	}
	
	// Below is a POST request to the API.
	// For POST requests you must be able to edit the POSTs body.
	// To do so, utilize software POSTMAN to make rest API calls.
	@RequestMapping(method = RequestMethod.POST, value = "/topics")
	public void addTopic(@RequestBody Topic topic)
	{
		topicService.addTopic(topic);
	}
	
	// Below is a PUT request to the API.
	// The PUT request will edit the API.
	@RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
	public void updateTopic(@RequestBody Topic topic, @PathVariable String id)
	{
		topicService.updateTopic(id,topic);
	}
	
	// Below is a DELTE request to the API.
	// The DELETE request will delete the requested instance in the API.
	@RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
	public void deleteTopic(@PathVariable String id)
	{
		topicService.deleteTopic(id);
	}
}
