package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/headers")
public class F_Request_Headers_Controller {
    //Also we can narrow down a request using request headers also
    //Every Request Consists with two parts
    //Header (Meta-data)
    //Body

    //So using these meta-data we can narrow down requests in spring
    //consumes = {MediaType}, this will require content-type header from front end
    //produce = Accept
    //headers = {"Content-Type=application/json","Accept=text/html"}


    //here we can narrow down a request using request headers
    //the thing which happen here is using the request header (Content-Type)
    //you can choose what handler method to execute

    //if the request is sent without content type header then
    //there will be an error called unsupported media type (415)


    //to invoke this you have to send content-type=application/json from the fornt
    //end
    @GetMapping(consumes = "application/json")
    public String getMapping1() {
        return "Get Mapping Invoked 1";
    }

    //To invoke this you have to send content-type=text/html from the front
    //end
    @GetMapping(consumes = "text/html")
    public String getMapping2() {
        return "Get Mapping Invoked 2";
    }

    //this handler method will produce only text/html type content
    //request sender can use Accept header to inform what type
    //of response body it is expecting from the server
    @GetMapping(produces = "text/html")
    public String getMapping3() {
        return "Get Mapping Invoked 3";
    }

    //The three ways that we can use to narrow down a request
    //01. Path Variables
    //02. Query String parameters
    //03. Request headers


}
