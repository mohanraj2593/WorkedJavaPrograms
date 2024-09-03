package BusResv;

public class Bus
{
    private int BusNo;
    private boolean Ac;
    private int Capacity;
    Bus(int no,boolean ac,int cap){
        this.BusNo=no;
        this.Ac=ac;
        this.Capacity=cap;

    }
    public int getCapacity(){//accessor
        return Capacity;

    }
    public void setCapacity(int cap){//Mutator
        Capacity=cap;

    }
    public int getBusNo(){
        return BusNo;
    }
    public boolean getAc(){
        return Ac;
    }
    public void setAc(boolean ac){
        Ac=ac;

    }
//    public void setBusNo(int no){ Bus No is Private Not change the bus no because Security
//        BusNo=no;
//
//    }
    public void DisplayBusInfo(){
        System.out.println("BusNo:"+BusNo+" Ac:"+Ac+" Capacity:"+Capacity);

    }
}
