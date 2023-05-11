public class Me implements Tourist {
    
    static int budget = 1000;

    public void visit() {
        System.out.print("Enjoying my stay");
    }


    public void visit(Boracay boracay){

        if(budget !=0) { System.out.print("Finally i'm here! ");
    }
        else {
            
         System.out.println("I don't know what to do here ");
       
        }

    budget = budget - boracay.airFare;
    checkBudget(); 
}

    public void visit(Bulacan bulacan){

        if(budget !=1000) { System.out.println("Kuha bayad ng upa hehe. ");
    }
        else {

            System.out.println("hindi nag bayad! ");
           
        }

    budget = budget - bulacan.airFare;
    checkBudget();
}

    public void visit(Cavite cavite) {

        if(budget !=1000) { System.out.print("I'm with The Lopez Family! ");
    }
        else {

             System.out.println("gusto ko na umuwi ");
            
        }

    budget = budget - cavite.airFare; 
    checkBudget();
}


    public void visit(Cubao cubao) {

        if(budget !=1000) { System.out.print("Just going around here. ");
    }
        else {

            System.out.println("gusto ko na umuwi. ulit. hehe ");
        }

    budget = budget - cubao.airFare;
    checkBudget();
}    

    public void visit(Pasig pasig){

        if(budget !=1000) { System.out.print("Just gonna visit my couz! ");
    }

        else {

            System.out.println("gusto ko na umuwi. ulit. ulit. hehe ");
        }

    budget = budget - pasig.airFare;
    checkBudget();
}        

    public void checkBudget() {
        System.out.println("My budget is " + budget);
    }
}
