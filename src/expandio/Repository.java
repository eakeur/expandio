package expandio;

import java.util.ArrayList;
import java.util.Comparator;

public class Repository {

    public Repository(){
        try {
            var list = getAll();
            list.sort(new Comparator<Material>(){
                @Override
                public int compare(Material m1, Material m2){
                    return Integer.compare(m1.getId(), m2.getId()); 
                }
            });
            lastId = list.get(list.size() - 1).getId();
        } catch (Exception e) {
            
            e.printStackTrace();
        }
    }

    private final Data storage = new Data();

    private int lastId;

    private Material parseData(String[] data){
        return new Material(Integer.parseInt(data[0]), data[1].trim(), Double.parseDouble(data[2]));
    }

    private String[] toArray(Material mat){
        return new String[]{
            mat.getId() + "", mat.getName(), mat.getCoeficient() + ""
        };
    }

    public void add(String name, double coeficient) throws Exception {
        try {
            storage.add(toArray(new Material(lastId+1, name, coeficient)));
        } catch (Exception e) {
            throw new Exception("Element not created :(");
        } 
    }

    public Material getById(int id) throws Exception {
        try {
            var results = storage.findLine("" + id);
            if (results.size() != 0){
                return parseData(results.get(0));
            }
            throw new Exception("Element not found :(");
        } catch (Exception e) {
            throw new Exception("Element not found :(");
        }
    }

    public ArrayList<Material> getAll() throws Exception {
        try {
            var results = storage.read();
            var list = new ArrayList<Material>();
            for (var data : results) list.add(parseData(data));
            return list;
        } catch (Exception e) {
            throw new Exception("Elements not found :(");
        }
    }

    public void remove(int id) throws Exception {
        try {
            storage.remove(id + "");
        } catch (Exception e) {
            throw new Exception("Error deleting the element :(");
        }
    }
}
