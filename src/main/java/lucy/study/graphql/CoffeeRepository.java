package lucy.study.graphql;

import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class CoffeeRepository {

    private Map<String, Coffee> coffeeMap = new ConcurrentHashMap<>();

    @PostConstruct
    private void loadSchema(){
        coffeeMap.put("mocha", new Coffee("coffee01", "mocha", 1200));
        coffeeMap.put("latte", new Coffee("coffee02", "latte", 1000));
        coffeeMap.put("americano", new Coffee("coffee03", "americano", 900));
    }

    public Coffee findByName(String name){
        return coffeeMap.get(name);
    }

}

