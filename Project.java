class Project {
    private String name;
    private String description;
    private double initialCost;

    Portfolio port = new Portfolio();


    //Setter no given attributes
    public Project(){
    }

    //Getter by Name Attribute only
    public String elevatorPitch(){
        return this.name + " (" + this.initialCost + ") : " + this.description + "\n";
    }

    //Setter -Name Only-
    public Project(String name){
        this.name = name;
        port.addToList(name, initialCost, description);
    }

    //Getter -Name Only-
    public String getJustName(){
        return this.name;
    }

    //Setter -Name And Description-
    public Project(String name, String description){
        this.name = name;
        this.description = description;
        port.addToList(name, initialCost, description);
    }

    //Getter -Cost Only-
    public double getJustCost(){
        return this.initialCost;
    }

    //Setter with all attributes
    public Project(String name, double initialCost, String description){
        this.name = name;
        this.initialCost = initialCost;
        this.description = description;
        port.addToList(name, initialCost, description);
    }

    //Getter -Description Only-
    public String getJustDesc(){
        return this.description;
    }
}

