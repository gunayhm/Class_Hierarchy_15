package org.example.tablePerClass;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Entity
@Table(name = "toy")
@Data
public class Toy {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gen_type")
    @SequenceGenerator(name = "gen_type", sequenceName = "toy_seq", allocationSize = 1)
    private Long id;

    private String name;
}
