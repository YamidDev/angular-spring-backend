package com.springboot.backend.apirest.models.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Api implements Serializable {

    @Id
    private String id;

    public Api(){

    }

    public Api(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
