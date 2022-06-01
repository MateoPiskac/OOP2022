package fer.hr.oop;

public class BankReceivingSystem implements ReceivingSystem {
    private int NumberOfCustomers=0;
    private int UrgentListSize = 0;
    private int NonUrgentListSize = 0;
    private boolean EmployeeStatus=false;


    @Override
    public void customerArrived(boolean urgent) {
        NumberOfCustomers++;
        if(urgent) {
            UrgentListSize++;
        }
        else {
            NonUrgentListSize++;
        }
        calculateEmployeeStatus();
    }

    @Override
    public void customerLeft(boolean urgent) {
        if(urgent) {
            UrgentListSize--;
        }
        else {
            NonUrgentListSize--;
        }
        calculateEmployeeStatus();
    }

    @Override
    public void calculateEmployeeStatus() {
        if(UrgentListSize+NonUrgentListSize>0)
            EmployeeStatus=true;
        else
            EmployeeStatus=false;
    }

    @Override
    public int getUrgentListSize() {
        return UrgentListSize;
    }

    @Override
    public int getNonUrgentListSize() {
        return NonUrgentListSize;
    }

    @Override
    public boolean isEmployeeOccupied() {
        return EmployeeStatus;
    }

    @Override
    public int getNumberOfArrivedCustomers() {
        return NumberOfCustomers;
    }
}
