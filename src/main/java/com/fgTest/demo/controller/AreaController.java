package com.fgTest.demo.controller;

import com.fgTest.demo.entity.Area;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value={"area/"})
public class AreaController {

    @RequestMapping(value="getAreaLists",method = RequestMethod.GET)
    public List<Area> getAreaLists(){
        return new ArrayList<>();
    }
}
