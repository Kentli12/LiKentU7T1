import java.util.ArrayList;
public class UsedCarLot {
    private ArrayList<Car> inventory;

    public UsedCarLot(){
        inventory = new ArrayList<Car>();
    }

    public ArrayList<Car> getInventory(){
        return inventory;
    }

    public void addCar(Car carToAdd){
        inventory.add(carToAdd);
    }
    public boolean swap(int swap1, int swap2){
        if(swap1<inventory.size() && swap2<inventory.size()){
            Car car1 = inventory.get(swap1);
            Car car2 = inventory.get(swap2);
            inventory.set(swap1,car2);
            inventory.set(swap2,car1);
            return true;
        }else{
            return false;
        }
    }

}
