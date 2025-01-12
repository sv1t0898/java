package gb.hw.hw3;


import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/messager")
public class MessagesController {

    private final MessagesService messagesService;

    public MessagesController(MessagesService messagesService){
        this.messagesService = messagesService;
    }

    @GetMapping
    public List<Message> getAllMeassages(){
        return messagesService.getMessagerList();
    }

    @GetMapping("/{id}")
    public Message getMessageById(@PathVariable("id") UUID uuid){
        return messagesService.getMessage(uuid);
    }

    @PostMapping
    public Message addMassage(@RequestBody Message message){
        return messagesService.addMessage(message);
    }

    @PostMapping("/{id}")
    public Message editMessageById(@PathVariable("id") UUID uuid, @RequestBody Message message){
        messagesService.editeMessage(uuid, message);
        return message;
    }

    @DeleteMapping("{id}")
    public void deletMessageById(@PathVariable("id") UUID uuid){
        messagesService.deliteMessag(uuid);
    }



}
