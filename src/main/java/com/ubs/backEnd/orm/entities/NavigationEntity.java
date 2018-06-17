package com.ubs.backEnd.orm.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Navigation", schema = "dbo", catalog = "UBS")
public class NavigationEntity {
    private int id;
    private String header;
    private NavigationEntity parent;
    private Set<NavigationEntity> children;

    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    @Column(name = "Id", unique = true, nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Header", nullable = false)
    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    @ManyToOne()
    @JoinColumn(name="ParentId")
    @JsonIgnore
    public NavigationEntity getParent() {
        return parent;
    }

    public void setParent(NavigationEntity parent) {
        this.parent = parent;
    }

    @OneToMany(mappedBy = "parent")
    public Set<NavigationEntity> getChildren() {
        return children;
    }

    public void setChildren(Set<NavigationEntity> children) {
        this.children = children;
    }
}
