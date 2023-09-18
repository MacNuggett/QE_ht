package com.example.demo.controllers;

import com.example.demo.models.Triangle;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TriangleController {

    @PostMapping("/get_triangle_info")
    public Triangle getInfo(@RequestBody Triangle triangle) throws Exception{
        if (triangle.getA()==0 || triangle.getB()==0)
            throw new Exception("Side of a triangle cannot be null");
        else {
            Triangle triangleToAnswer = new Triangle(triangle.getA(), triangle.getB());
            return triangleToAnswer;
        }
    }
}
