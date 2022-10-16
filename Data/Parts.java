package Data;

public abstract class Parts {
    String name;
    String producer;

    public Parts(String name, String producer) {
        this.name = name;
        this.producer = producer;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getProducer() {
        return producer;
    }
    public void setProducer(String producer) {
        this.producer = producer;
    }
}
