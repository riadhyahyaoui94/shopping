package com.boockstore.shopping.service;
import com.boockstore.shopping.entities.Message;
import java.util.List;

public interface MessageServiceInterface {
    List<Message> retrieveAllMessages();

    Message addMessage(Message msg);

    void deleteMessage(int id);

    Message updateMessage(Message msg);

   Message retrieveMessagebyID(int id);


}
