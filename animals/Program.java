package animals;

import animals.Controller.PetController;
import animals.Model.Pet;
import animals.Services.IRepository;
import animals.Services.PetRepository;
import animals.UserInterface.ConsoleMenu;

public class Program {
    public static void main(String[] args) throws Exception {

        IRepository <Pet> myFarm = new PetRepository();
        PetController controller = new PetController(myFarm);
        new ConsoleMenu (controller).start();
    }
} 