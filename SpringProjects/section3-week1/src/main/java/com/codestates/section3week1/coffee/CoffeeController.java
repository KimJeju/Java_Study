package com.codestates.section3week1.coffee;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/v1/coffees", produces = MediaType.APPLICATION_JSON_VALUE)
public class CoffeeController {

    @PostMapping
    public String postCoffee(@RequestParam("engName") String engName,
                             @RequestParam("korName") String korName,
                             @RequestParam("price") int price){
        System.out.println("# engName : " + engName);
        System.out.println("# korName : " + korName);
        System.out.println("# price" + price);

        String response =  "{\"" +
                "engName\":\"" +engName+"\"," +
                "korName\":\"" +korName+"\"," +
                "price\":\""+price+"\","+
                "\"}";

        return response;
    }


    @GetMapping("/{coffee-id}")
    public String getCoffee(@PathVariable("coffee-id")Long coffeeId){
        System.out.println("# Coffee- :" + coffeeId);

        return null;
    }

    @GetMapping
    public String getCoffees(){
        return null;
    }
}
