package net.engineeringdigest.journalApp.entity;

import lombok.Data;
import lombok.NonNull;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Data //for getters and setters using lambok
@Document(collection = "users")
public class User {
    @Id
    private ObjectId id;
    @Indexed(unique = true) //makes all the usernames unique
    @NonNull //it shouldn't be null
    private String userName;
    @NonNull
    private String password;
    @DBRef
    private List<JournalEntry> journalEntries =new ArrayList<>();
    private List<String> roles;
}

