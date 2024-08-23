package com.kafka;

import com.launchdarkly.eventsource.EventHandler;
import com.launchdarkly.eventsource.EventSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.net.URI;
import java.util.concurrent.TimeUnit;


@Service
public class WikimediaProducer {


    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;
    private  static  String topic= "wikimedia" ;

    private static String url = "https://stream.wikimedia.org/v2/stream/recentchange";


    public void sendMessage() throws InterruptedException {

        EventHandler eventHandler =  new WikimediaChangesHandler(kafkaTemplate, topic);

        EventSource eventSource = new EventSource.Builder(eventHandler, URI.create(url)).build();
        eventSource.start();


        TimeUnit.MINUTES.sleep(1);

    }


}