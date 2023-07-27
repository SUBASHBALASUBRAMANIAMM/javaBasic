package obj;
import java.lang.*;
public  class  Phone {
    public String cam;
    int display_size;
    int nSim;

    void specs(){
        System.out.println("Cam:"+cam +"Display Size:" + display_size+ "No of sims:" + nSim );
    }

    Phone(String cam,int display_size,int nSim){
        this.cam = cam;
        this.display_size = display_size;
        this.nSim = nSim;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "cam='" + cam + '\'' +
                ", display_size=" + display_size +
                ", nSim=" + nSim +
                '}';
    }
}
