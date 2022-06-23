package com.codestates.section3week1.order;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;

@RestController
@RequestMapping(value = "/v1/orders", produces = MediaType.APPLICATION_JSON_VALUE) //공용 url 설정
public class OrderController {

    @PostMapping
    public String postOrder(@RequestParam("memberId") String memberId,
                            @RequestParam("coffeeId") String coffeeId){
        System.out.println("# memberId :" + memberId);
        System.out.println("# coffeeId :" + coffeeId);

        String response =
                "{\"" +
                        "memberId\":\"" + memberId + "\"" +
                        "coffeeId\":" + coffeeId + "\"" +
                        "}";

        return response;
    }

    @GetMapping("{order-id}")
    public String getOrder(@PathVariable("order-id")long orderId){
        System.out.println("#order-id : " + orderId);

        return null;
    }

    @GetMapping
    public String getOrders(){
        return null;
    }
}
