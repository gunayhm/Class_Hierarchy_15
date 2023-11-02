package org.example.mappedSuperClass;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "monster_ear")
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class EarMonster extends Monster{

    int countOfEars;

}
