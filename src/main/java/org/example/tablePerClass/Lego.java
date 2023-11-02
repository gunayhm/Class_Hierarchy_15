package org.example.tablePerClass;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "lego")
@Data
public class Lego extends Toy{

    private int countOfDeatils;

}
