package com.bakul.service.impl;

import com.bakul.Constant;
import com.bakul.service.ICartSerivce;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CartServiceImpl implements ICartSerivce {

    @Override
    public String getAllCarts() {
        RestTemplate restTemplate = new RestTemplate();
        //restTemplate.getForObject(Constant.FAKE_STORE_API_URL, String.class);

        ResponseEntity<String> responseEntity =restTemplate.getForEntity(Constant.FAKE_STORE_API_URL, String.class);
        if(responseEntity.getStatusCode()== HttpStatus.ACCEPTED){
            String responseBody=responseEntity.getBody();

            ObjectMapper mapper = new ObjectMapper();
            mapper.readValue;

        }else{

        }
    }
}
