class Project {
    private String name;
    private String description;
    private double initialCost;

    Portfolio port = new Portfolio();

    //Getter by no given Attributes
    public String getAllProjects(){
        return name + " (" + initialCost + ") : " + description + "\n";
    }

    //Setter no given attributes
    public Project(){
        this.name = "name";
        this.initialCost = 0.0;
        this.description = "description";
    }



    //Getter by Name Attribute only
    public String elevatorPitch(String name){
        return name + " (" + initialCost + ") : " + description + "\n";
    }

    //Setter with only name attribute
    public Project(String name){
        this.name = name;
        this.initialCost = 0.0;
        this.description = "description";
    }



    //Getter by 2 attributes
    public String getByNameAndDesc(String name, String description){
        return name + " (" + initialCost + ") : " + description + "\n";
    }

    //Setter with both 2 attributes
    public Project(String name, String description){
        this.name = name;
        this.initialCost = 0.0;
        this.description = description;
    }

    //Getter by cost attribute
    public String getByCost(double initialCost){
        return name + " (" + initialCost + ") : " + description + "\n";
    }

    //Setter with all attributes
    public Project(String name, double initialCost, String description){
        this.name = name;
        this.initialCost = initialCost;
        this.description = description;
    }
}

