class ProjectTest {
    public static void main(String[] args){
        Project project1 = new Project();
        Project project2 = new Project("Project 2");
        Project project3 = new Project("Project 3", "Project 3 description");
        Project project4 = new Project("Project 4", 25.00, "Project 4 description");

        System.out.println(project1.getAllProjects());
        System.out.println(project2.elevatorPitch("Project 2 Name"));
        System.out.println(project3.getByNameAndDesc("Project 3 Name", "Project 3 description"));
        System.out.println(project4.getByCost(25.00));
    }
}
