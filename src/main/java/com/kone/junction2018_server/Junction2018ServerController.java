package com.kone.junction2018_server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.kone.junction2018_server.Repo;

import java.util.List;

@RestController
@RequestMapping({"${url.path}", "${url.path}/${url.path.basicauth}"})
public class Junction2018ServerController {

    @Autowired
    private Repo repository;

    @RequestMapping(value = "/getGeolocation/{id}", method = RequestMethod.GET)
    public @ResponseBody
    ResponseEntity getGeolocation(@PathVariable(value = "id") final int id) {
        return ResponseEntity.ok("{\"id\": " + id + ", \"latitude\": 60.1695, \"longitude\": 24.9354, \"orientation\": 15.5}");
    }

    @RequestMapping(value = "/getMap", method = RequestMethod.GET)
    public @ResponseBody
    ResponseEntity getMap() {
        return ResponseEntity.ok("ok");
    }

    @RequestMapping(value = "/getAllHaikus", method = RequestMethod.GET)
    public @ResponseBody
    ResponseEntity getAllHaikus() {
        List<Haiku> haikus = repository.findAll();
        String result = haikus.get(0).toString();
        return ResponseEntity.ok(result);
    }

    @RequestMapping(value = "/getClosestHaiku/{coordinates}", method = RequestMethod.GET)
    public @ResponseBody
    ResponseEntity getClosestHaiku(@PathVariable(value = "coordinates") final String coordinates) {
        return ResponseEntity.ok(coordinates);
    }

    @RequestMapping(value = "/postHaiku", method = {RequestMethod.POST, RequestMethod.PUT})
    public @ResponseBody
    ResponseEntity postHaiku(@RequestBody Haiku haiku)
    {
        repository.save(haiku);
        return ResponseEntity.ok(haiku);
    }
}
