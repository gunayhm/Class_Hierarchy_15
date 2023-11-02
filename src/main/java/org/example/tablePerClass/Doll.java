package org.example.tablePerClass;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "doll")
@Data
public class Doll extends Toy{

    private String type;
}
