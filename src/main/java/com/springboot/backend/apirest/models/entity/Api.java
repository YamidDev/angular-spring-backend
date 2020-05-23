package com.springboot.backend.apirest.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Api implements Serializable {

    @Id
    private String id;

    @Column
    private String client, codpoint, description;

    @Column
    private boolean status;

    @Column
    private int ratio;

    @Column
    private Long latitude, longitude;

    public Api(){ }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public Long getLatitude() {
        return latitude;
    }

    public void setLatitude(Long latitude) {
        this.latitude = latitude;
    }

    public Long getLongitude() {
        return longitude;
    }

    public void setLongitude(Long longitude) {
        this.longitude = longitude;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Api)) return false;

        Api api = (Api) o;

        if (isStatus() != api.isStatus()) return false;
        if (getRatio() != api.getRatio()) return false;
        if (getId() != null ? !getId().equals(api.getId()) : api.getId() != null) return false;
        if (getClient() != null ? !getClient().equals(api.getClient()) : api.getClient() != null) return false;
        if (getCodpoint() != null ? !getCodpoint().equals(api.getCodpoint()) : api.getCodpoint() != null) return false;
        if (getDescription() != null ? !getDescription().equals(api.getDescription()) : api.getDescription() != null)
            return false;
        if (getLatitude() != null ? !getLatitude().equals(api.getLatitude()) : api.getLatitude() != null) return false;
        return getLongitude() != null ? getLongitude().equals(api.getLongitude()) : api.getLongitude() == null;
    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getClient() != null ? getClient().hashCode() : 0);
        result = 31 * result + (getCodpoint() != null ? getCodpoint().hashCode() : 0);
        result = 31 * result + (getDescription() != null ? getDescription().hashCode() : 0);
        result = 31 * result + (isStatus() ? 1 : 0);
        result = 31 * result + getRatio();
        result = 31 * result + (getLatitude() != null ? getLatitude().hashCode() : 0);
        result = 31 * result + (getLongitude() != null ? getLongitude().hashCode() : 0);
        return result;
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
}
