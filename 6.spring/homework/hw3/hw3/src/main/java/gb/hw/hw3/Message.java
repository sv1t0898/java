package gb.hw.hw3;

import java.util.UUID;

public class Message {

    private UUID uuid;
    private String name;
    private String message;

    public Message(String name, String message) {
        this.uuid = UUID.randomUUID();
        this.name = name;
        this.message = message;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
