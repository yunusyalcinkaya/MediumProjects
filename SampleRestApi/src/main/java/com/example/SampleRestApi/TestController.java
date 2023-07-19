package com.example.SampleRestApi;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// ! NOTE: METODLAR ÖRNEK OLMASI İÇİN OLUŞTURULMUŞTUR. DOĞRU KULLANIM DEĞİLDİR.
@RestController
@RequestMapping("/api")
public class TestController {
    @GetMapping
    public List<Integer> getAll(){
        return new ArrayList<>(Arrays.asList(1,2,3));
    }
    @GetMapping("/{id}")
    public String get(@PathVariable int id){
        return "Return item, id: " + id;
    }
    @PostMapping
    public String add(@RequestParam String name){
        return name + " added";
    }
    @PutMapping
    public String update(@RequestParam String name, @RequestParam String newName){
        return name + " updated. New name: " + newName;
    }
    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id){
        return "item deleted. id: " + id;
    }
}
