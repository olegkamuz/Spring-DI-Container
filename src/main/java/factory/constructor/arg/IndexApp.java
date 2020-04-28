package factory.constructor.arg;

public class IndexApp {
    private IService service;

    public IndexApp(IService service) {
        this.service = service;
    }

    public String serve() {
        return service.serve();
    }
}