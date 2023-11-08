interface School{
void members();
}



class school {
    public void members() {
        System.out.println("School: University of Rwanda");
    }
}


class principal extends school {
    public void members() {
        System.out.println("Principal: We provide the best service for both Lectures and Students");
    }
}


class Lecturers extends principal {
   public void members() {
        System.out.println("Lecturers: we provide the best lessons.");
    }
}
class Students extends Lecturers {
    public void family() {
        System.out.println("Students: WE aim to succeed.");
    }
}

public class inhertex2 {
    public static void main(String[] args) {
        Students membA = new Students();
        Lecturers membB = new Lecturers(); 
        principal membC = new principal();
        school membD = new school();
        membA.members(); 
        membB.members(); 
        membC.members(); 
        membD.members(); 
    }
}