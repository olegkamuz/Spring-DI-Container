package factory.constructor.arg;

public class ServiceFactory {
    public IService getService(int number) {
        if(number == 1){
            return new IndexedService();
        }
        return null;
    }
}