package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/validate")
public class D_Validate_Path_Variables_Controller {
//With path variables we have the validating options also
//01.Reg Ex Validation path={/path:[a-z]{3}}
//02.Single Character Validations path={/pa?h}
//03.Single Wild Card Validator path={/path/*/id}
//04Multiple Wild Card Validator path={/path/**/id}


    //http://localhost:8080/mapping/validate/ied
    //http://localhost:8080/mapping/validate/iad
    //http://localhost:8080/mapping/validate/ild
    @GetMapping(path = "/i?d")//character mapping ?
    public String getMapping2(){
        return "Get Mapping Invoked 1 ";
    }

    //http://localhost:8080/mapping/validate/idrm/namaae
    @GetMapping(path = "/id??/nam??e")
    public String getMapping1(){
        return "Get Mapping Invoked 2 ";
    }

    //http://localhost:8080/mapping/validate/id/aaa
    @GetMapping(path = "/id/???")
    public String getMapping3(){
        return "Get Mapping Invoked 3 ";
    }

    //http://localhost:8080/mapping/validate/my/name/dasunkasun/end
    //one or more characters inside a segment
    @GetMapping(path = "/my/name/*/end")//wild card mapping
    public String getMapping4(){
        return "Get Mapping Invoked 4 ";
    }


    //http://localhost:8080/mapping/validate/my/address/C001/Dasun/Galle/1199/end
    //zero or more segments with unlimited characters
    @GetMapping(path = "/my/address/**/end")//Dual wild card mapping
    public String getMapping5(){
        return "Get Mapping Invoked 5";
    }


    //http://localhost:8080/mapping/validate/myName/Ashan
    //http://localhost:8080/mapping/validate/myName/Dasun

    //path variable
    @GetMapping(path = "/myName/{name:[A-Z]{1}[a-z]{4}}")
    public String getMapping6(@PathVariable String name){
        System.out.println(name);
        return "Get Mapping Invoked 6"+name;
    }

    //http://localhost:8080/mapping/validate/myNumbers/1000
    @GetMapping(path = "/myNumbers/{numbers:[0-9]{5}}")
    public String getMapping7(@PathVariable String numbers){
        System.out.println(numbers);
        return "Get Mapping Invoked 6"+numbers;
    }






}
