package org.example.mappedSuperClass;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "ear_monster", schema = "lec15")
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class EarMonster extends Monster{

    int countOfEars;

}
