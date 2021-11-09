package com.boockstore.shopping.service;

import com.boockstore.shopping.entities.Message;
import com.boockstore.shopping.repository.MessageRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class MessageService implements MessageServiceInterface {
    @Autowired MessageRepo message;
    @Override
    public List<Message> retrieveAllMessages() {
        ArrayList<Message> messages= (ArrayList<Message>) message.findAll();
        return messages;
    }

    @Override
    public Message addMessage(Message msg) {
        message.save(msg);
        return msg;
    }

    @Override
    public void deleteMessage(int id) {
        message.deleteById(id);

    }

    @Override
    public Message updateMessage(Message msg) {
        message.save(msg)    ;
        return msg;
    }

    @Override
    public Message retrieveMessagebyID(int id) {
      Message message1= message.findById(id).orElse(null);
        return message1;
    }
}
