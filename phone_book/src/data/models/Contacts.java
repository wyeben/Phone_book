package data.models;

import lombok.Data;

@Data
public class Contacts {
    private String id;
    private String phonebookId;
    private String name;
    private String phoneNumber;
}
