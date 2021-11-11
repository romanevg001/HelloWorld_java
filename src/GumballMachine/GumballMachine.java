package GumballMachine;

public class GumballMachine {
    State soldOutState;
    State noQuarterState;
    State hasQuarterState; 
    State soldState;
    State state;
    int count = 0;
    
    public GumballMachine(int numberGumballs) { 
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        this.count = numberGumballs; 
        setInitState();
    }

    public void insertQuarter() { 
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter(); 
    }

    public void turnCrank() { 
        state.turnCrank(); 
        state.dispense();
    }

    private void setInitState() {
        if (count > 0) {
            state = noQuarterState; 
        } else {
            state = soldOutState;
        } 
    }

    void refill(int count) {
        this.count += count;
        System.out.println("The gumball machine was just refilled; it's new count is: " + this.count);
        state.refill();
    }

    void setState(State state) { 
        this.state = state;
    }

    void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (count > 0) {
            count -= 1; 
        }
    }

    public int getCount() {
        return count;
    }



    public State getNoQuarterState() {
        return noQuarterState;
    }
    public State getSoldState() {
        return soldState;
    }
    public State getHasQuarterState() {
        return hasQuarterState;
    }
    public State getSoldOutState() {
        return soldOutState;
    }
    
    
}
