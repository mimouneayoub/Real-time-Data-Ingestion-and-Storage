package com.kafka;

import com.kafka.entity.WikiDataChange;
import com.kafka.repo.WikiDataChangeRepository;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class WikimediaConsumer {


    @Autowired
    private WikiDataChangeRepository repository;

    @KafkaListener(topics = "wikimedia",groupId = "my-group")
    public void consume(String mssg){



      JSONObject json = new JSONObject(mssg);
        System.out.println(json.toString());
        WikiDataChange change = new WikiDataChange();
        change.setType(json.getString("type"));
        change.setTitle(json.getString("title"));
        change.setTimestamp(json.getLong("timestamp"));
        change.setUser(json.getString("user"));
        repository.save(change);
        System.out.println("Message stored successfully");




    }
}