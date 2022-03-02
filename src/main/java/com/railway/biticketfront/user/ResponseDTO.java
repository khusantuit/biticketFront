package com.railway.biticketfront.user;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ResponseDTO<T> {
    private T data;
}