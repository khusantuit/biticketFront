package com.railway.biticketfront.booking;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookingService {
    private final RestTemplate restTemplate;

    public List<String> getBookings() {
//        restTemplate.getForObject();
        return null;
    }
}
