package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/segment")
public class B_Path_Segments_Controller {
//Ways of Ambiguous Mappings Resolving Methods
//01 Use path segments to narrow down requests
//path="/customer/add"

//localhost:8080/mapping/segment
//localhost:8080/mapping/segment/two
//localhost:8080/mapping/segment/three
//localhost:8080/mapping/segment/three/four


//localhost:8080/mapping/segment/C001/four

    @GetMapping
    public String getMapping2(){
        return "Get Mapping Invoked 1";
    }

    //request narrow downing using path segments
    @GetMapping(path = "/two")
    public String getMapping1(){
        return "Get Mapping Invoked 2";
    }

    @GetMapping(path = "/three")
    public String getMapping3(){
        return "Get Mapping Invoked 3";
    }

    @GetMapping(path = "/three/four")
    public String getMapping4(){
        return "Get Mapping Invoked 3/4";
    }



}
