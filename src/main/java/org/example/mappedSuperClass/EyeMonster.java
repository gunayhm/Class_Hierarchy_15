package org.example.mappedSuperClass;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Data;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "monster")
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class EyeMonster extends Monster{

    int countOfEyes;

    @Override
    public String toString() {
        return "EyeMonster{} " + super.toString()+
                "countOfEyes"+getCountOfEyes();
    }
}
