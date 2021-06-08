import java.util.ArrayList;

class Portfolio {
    public ArrayList<Object> projectsList = new ArrayList<Object>();
    public void addToList(String name, double initialCost, String description){
        Object p = name + " (" + initialCost + ") : " + description;
        projectsList.add(p);
    }
}
