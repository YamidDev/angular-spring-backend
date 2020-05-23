package com.springboot.backend.apirest.models.dao;

import com.springboot.backend.apirest.models.entity.Api;
import org.codehaus.jackson.map.util.JSONPObject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IServiceDao extends JpaRepository<Api, String> {
    JSONPObject save(JSONPObject jsonpobject);
}
