class ProjectTest {
    public static void main(String[] args){
        Project project1 = new Project();
        Project project2 = new Project("Everlasting Gobstopper");
        Project project3 = new Project("Project 3", "Project 3 description");
        Project project4 = new Project("Pied Piper", 18995.99, "A middle-out compression software");

        System.out.println(project2.elevatorPitch());

        String name = project4.getJustName();
        String description = project4.getJustDesc();
        double cost = project4.getJustCost();

        System.out.println("Project Name" + name + " (" + cost + ") : Description: " + description + "\n");
    }
}
