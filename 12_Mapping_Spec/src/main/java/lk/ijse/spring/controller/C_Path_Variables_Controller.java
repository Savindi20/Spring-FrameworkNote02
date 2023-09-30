package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pathVariable")
public class C_Path_Variables_Controller {
//With the previous path segments we can pass simple data
//path="/customer/{ID}" @PathVariable("ID")
//localhost:8080/mapping/customer/C001
//localhost:8080/mapping/customer/delete/C001

//if you are using path segments then you have to type exact path segment info
//localhost:8080/mapping/pathVariable/id
//localhost:8080/mapping/pathVariable/id/name

//when you are using path variables you can pass any data as a path segment
//localhost:8080/mapping/pathVariable/C001
//localhost:8080/mapping/pathVariable/C002/Kamal

//@PathVariable -> required annotation

    @GetMapping(path = "/{id}")
    public String getMapping2(@PathVariable("id") String ids){ //alies
        System.out.println(ids);
        return "Get Mapping Invoked 1 "+ids;
    }

    //request narrow downing using path segments
    @GetMapping(path = "/{id}/{name}")
    public String getMapping1(@PathVariable String id,@PathVariable String name){
        System.out.println(id+" "+name);
        return "Get Mapping Invoked 2 "+id+" "+name;
    }

    //localhost:8080/mapping/pathVariable/id/Dasun
    @GetMapping(path = "/id/{name}")
    public String getMapping3(@PathVariable String name){
        System.out.println(name);
        return "Get Mapping Invoked 3 "+name;
    }

}
