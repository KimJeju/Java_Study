package com.codestates.section3week1.coffee;


import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/v1/coffees")
public class CoffeeController {

    @PostMapping
    public ResponseEntity postCoffee(@RequestParam("engName") String engName,
                                     @RequestParam("korName") String korName,
                                     @RequestParam("price") String price){
        Map<String,String > map = new HashMap<>();
        map.put("engName",engName);
        map.put("korName",korName);
        map.put("price",price);

        return new ResponseEntity(map, HttpStatus.CREATED);
    }


    @GetMapping("/{coffee-id}")
    public ResponseEntity getCoffee(@PathVariable("coffee-id")Long coffeeId){
        System.out.println("# Coffee- :" + coffeeId);

        return new ResponseEntity(coffeeId,HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity getCoffees(){
        return new ResponseEntity(HttpStatus.OK);
    }
}
