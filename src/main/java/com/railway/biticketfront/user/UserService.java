package com.railway.biticketfront.user;

import lombok.RequiredArgsConstructor;
import model.recieve.AddressDTO;
import model.recieve.UserDTO;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final RestTemplate restTemplate;

    public List<UserDTO> getList() {
        ResponseEntity<ResponseDTO<List<AddressDTO>>> exchange = restTemplate.exchange("http://localhost:8080/address/list?level=1", HttpMethod.GET, null, new ParameterizedTypeReference<ResponseDTO<List<AddressDTO>>>() {
        });

        System.out.println(exchange.getBody().getData().toString());
        return null;
    }
}
