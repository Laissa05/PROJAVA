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
class students extends Lecturers {
    public void members() {
        System.out.println("students: we aim to succeed.");
    }
}

public class inhertex2 {
    public static void main(String[] args) {
        students membA = new students();
        Lecturers membB = new Lecturers(); 
        principal membC = new principal();
        school membD = new school();
        membA.members(); 
        membB.members(); 
        membC.members(); 
        membD.members(); 
    }
    
}