package kata7;

import static spark.Spark.get;

public class Kata7 {
    public static void main(String[] args) {
        FlightApp flightApp = new FlightApp();
        
        get("/hello", (req, res) -> "Hello World");
        
        get("/hello/:name", (req, res) -> {
            return "Hello " + req.params(":name");
        });
        
        get("/flights/all", (req, res) -> {
            return flightApp.getAll();
        });
        
        get("/flights/day/:day", (req, res) -> {
            return flightApp.getDay(req.params(":day"));
        });
        
        get("/flights/distance/bigger/:distance", (req, res) -> {
            return flightApp.getBiggerDistance(req.params(":distance"));
        });
        
        get("/flights/distance/lower/:distance", (req, res) -> {
            return flightApp.getLowerDistance(req.params(":distance"));
        });
        
        get("/flights/cancelled", (req, res) -> {
            return flightApp.getCancelled();
        });
        
        get("/flights/diverted", (req, res) -> {
            return flightApp.getDiverted();
        });
        
    }
}
