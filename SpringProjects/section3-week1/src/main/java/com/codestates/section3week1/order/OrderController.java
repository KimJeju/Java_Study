package com.codestates.section3week1.order;


import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/v1/orders") //공용 url 설정
public class OrderController {

    @PostMapping
    public ResponseEntity postOrder(@RequestParam("memberId") String memberId,
                            @RequestParam("coffeeId") String coffeeId){

        Map<String,String> map = new HashMap<>();
        map.put("memberId",memberId);
        map.put("coffeeId",coffeeId);

        return new ResponseEntity(map, HttpStatus.CREATED);
    }

    @GetMapping("{order-id}")
    public ResponseEntity getOrder(@PathVariable("order-id")long orderId){
        System.out.println("#order-id : " + orderId);

        return new ResponseEntity(orderId,HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity getOrders(){
        return new ResponseEntity(HttpStatus.OK);
    }
}
