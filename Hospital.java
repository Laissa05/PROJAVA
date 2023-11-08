interface doctor{
    public void myinfor();   
}
  class infor implements doctor{
    public void myinfor(){
        System.out.println("My hospital provides therapists to our patients");
    }
}
class salary extends infor {
    public void wage(){
        System.out.println(700000);
    }
}
class adress extends salary{
    public void location(){
        System.out.println(":Gikondo");
    }
}
class appointment extends adress{
    public void plan(){
        System.out.println("I'm available in the afternoon");
    }
}
class team extends appointment {
    public void myteam(){
        System.out.println("team1");
    }
}
class department extends team {
    public void depart(){
        System.out.println("pschologist ");
    }
}
class experience extends department {
    public void ability(){
        System.out.println("My exprience is 10 years");
    }
}
class insurance extends experience {
    public void mentalhealth(){
        System.out.println("Prime insurance");
    }
}
class testmain{
    public static void main(String[] args) {
        insurance about = new insurance();
        about.mentalhealth();
        about.ability();
        about.depart();
        about.myteam();
        about.myinfor();
    }
    
}