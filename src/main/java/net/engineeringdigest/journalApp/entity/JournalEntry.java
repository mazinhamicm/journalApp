package net.engineeringdigest.journalApp.entity;

import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Date;
@Data //for getters and setters using lambok
@NoArgsConstructor
@Document(collection = "journal_entries")
public class JournalEntry {

    private ObjectId id;
    @NonNull
    private String title;
    private LocalDateTime date;
    private String content;


}
