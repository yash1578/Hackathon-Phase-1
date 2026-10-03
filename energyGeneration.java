public class energyGeneration {
    static double calculateTotalEnergy(double morningEnergy, double eveningEnergy){
        double totalEnergy = morningEnergy + eveningEnergy;
        System.out.println("Total Energy generated in KWH= "+totalEnergy);
        return totalEnergy;
    }
    public static void main(String[] args){
        int panelID=15454;
        double energy=8.10084;
        int solarPanels=652;
        char status='W';
        System.out.println("Panel ID= "+panelID);
        System.out.println("Energy generated in KWH= "+energy);
        System.out.println("Number of solar panels= "+solarPanels);
        System.out.println("System status= "+status);


        if(energy>10){
            System.out.println("Good Energy Generation");
        }
        else{
            System.out.println("Low Energy Generation");
        }
        double totalEnergy = calculateTotalEnergy(5.5, 3.2);
        System.out.println("Total Energy generated in KWH= "+totalEnergy);

    }
}