package com.app.tarea6;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class app {
    PUNTO punto;
    @RequestMapping(value={"/cuadrante"})
    @ResponseBody
    public String fin(@RequestParam int x, int y){
        punto = new PUNTO(x,y);
        return Met.ubicacion(x,y);
    }
}
