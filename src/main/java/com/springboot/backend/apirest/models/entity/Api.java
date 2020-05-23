package com.springboot.backend.apirest.models.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Api implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String client, codpoint, description;

    @Column
    private boolean status;

    @Column
    private int ratio;

    @Column
    private float latitude, longitude;

    public Api(){ }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getCodpoint() {
        return codpoint;
    }

    public void setCodpoint(String codpoint) {
        this.codpoint = codpoint;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getRatio() {
        return ratio;
    }

    public void setRatio(int ratio) {
        this.ratio = ratio;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(Long longitude) {
        this.longitude = longitude;
    }
    
    @Override
    public String toString() {
        return "Api{" +
                "id='" + id + '\'' +
                ", client='" + client + '\'' +
                ", codpoint='" + codpoint + '\'' +
                ", description='" + description + '\'' +
                ", status=" + status +
                ", ratio=" + ratio +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }

    private static final long serialVersionUID = 1L;
}
