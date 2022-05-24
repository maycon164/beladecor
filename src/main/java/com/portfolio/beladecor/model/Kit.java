package com.portfolio.beladecor.model;

import java.util.List;

import com.portfolio.beladecor.enums.Status;
import com.portfolio.beladecor.enums.Theme;
import lombok.Data;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Data
@Entity
public class Kit {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    private String name;
    private double totalValue;

    @ManyToMany()
    @JoinTable(
            name="kit_item",
            joinColumns = @JoinColumn(name = "KIT_ID", referencedColumnName = "ID"),
            inverseJoinColumns = @JoinColumn(name="ITEM_ID", referencedColumnName = "ID")
    )
    private List<Item> items;

    private Theme theme;
    private Status status;
}
