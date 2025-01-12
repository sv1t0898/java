package gb.hw.hw3;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class MessagesService {

    private final List<Message> messagerList = new ArrayList<>();

    public List<Message> getMessagerList(){
        return messagerList;
    }

    public Message getMessage(UUID uuid){
        return messagerList.stream()
                .filter(m -> m.getUuid().equals(uuid))
                .findFirst().orElse(null);
    }

    public Message addMessage(Message message){
        messagerList.add(message);
        return message;
    }

    public Message editeMessage(UUID uuid, Message message){
        Message messageNew = getMessage(uuid);
        if (messageNew != null){
            messageNew.setMessage(message.getMessage());
        }
        return messageNew;
    }

    public void deliteMessag(UUID uuid){
        messagerList.removeIf(m -> m.getUuid().equals(uuid));
    }

}
