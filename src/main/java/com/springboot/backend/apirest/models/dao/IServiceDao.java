package com.springboot.backend.apirest.models.dao;

import org.codehaus.jackson.map.util.JSONPObject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IServiceDao extends JpaRepository<JSONPObject, String> {
    JSONPObject save(JSONPObject jsonpobject);
}
