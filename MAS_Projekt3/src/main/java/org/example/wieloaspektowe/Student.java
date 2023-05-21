package org.example.wieloaspektowe;

import lombok.NonNull;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = lombok.AccessLevel.PRIVATE)
public class Student extends Person {

    Integer studentID;

    public Student(@NonNull Gender gender) {
        super(gender);
    }
}