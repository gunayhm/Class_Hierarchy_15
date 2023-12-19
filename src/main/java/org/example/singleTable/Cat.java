package org.example.singleTable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@Entity
@DiscriminatorValue("3")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Cat extends Animal {

    String nameOfOwner;

}
