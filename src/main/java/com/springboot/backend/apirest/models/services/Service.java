package com.springboot.backend.apirest.models.services;

import com.springboot.backend.apirest.models.dao.IServiceDao;
import org.codehaus.jackson.map.util.JSONPObject;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class Service {

    @Autowired
    private IServiceDao repo;

    public JSONPObject save(JSONPObject jsonpObject){
        return repo.save(jsonpObject);
    }

}
