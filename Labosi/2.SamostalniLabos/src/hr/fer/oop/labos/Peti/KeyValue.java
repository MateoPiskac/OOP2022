package hr.fer.oop.labos.Peti;

public class KeyValue <Key, Value>{
    private Key key;
    private Value id;
    public KeyValue(Key key, Value id){
        this.key=key;
        this.id=id;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public Value getValue() {
        return id;
    }

    public void setValue(Value id) {
        this.id = id;
    }
}
