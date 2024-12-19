import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import com.example.resources.MyResource;
import com.example.health.MyHealthCheck;

public class Application extends Application<Configuration> {
    public static void main(String[] args) throws Exception {
        new Application().run(args);
    }

    @Override
    public void initialize(Bootstrap<Configuration> bootstrap) {
        // Initialization logic
    }

    @Override
    public void run(Configuration configuration, Environment environment) {
        final MyResource resource = new MyResource();
        environment.jersey().register(resource);
        
        final MyHealthCheck healthCheck = new MyHealthCheck();
        environment.healthChecks().register("myHealthCheck", healthCheck);
    }
}