package task_91;


import java.util.Map;

public class MyOwnMap implements OwnMap{

    private Map.Entry<String, String>[] bucket;



    @Override
    public boolean put(String key, String value) {
        return false;
    }

    @Override
    public boolean containsKey(String key) {
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        return false;
    }

    @Override
    public String remove(String key) {
        return null;
    }

    @Override
    public String get(String key) {
        return null;
    }

    private final int getHashCode(String key){
        return (key == null) ? 0 : key.hashCode();
    }
}
