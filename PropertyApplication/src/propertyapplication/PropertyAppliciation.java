/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package propertyapplication;

/**
 *
 * @author lab_services_student
 */
// iEstateAgent interface
interface iEstateAgent {
    String getAgentName();
    double getPropertyPrice();
    double getAgentCommission();
}

// abstract EstateAgent class
abstract class EstateAgent implements iEstateAgent {
    private final String agentName;
    private final double propertyPrice;

    public EstateAgent(String agentName, double propertyPrice) {
        this.agentName = agentName;
        this.propertyPrice = propertyPrice;
    }

    @Override
    public String getAgentName() {
        return agentName;
    }

    @Override
    public double getPropertyPrice() {
        return propertyPrice;
    }

    @Override
    public double getAgentCommission() {
        return 0.20 * propertyPrice; // 20% commission
    }
}

// EstateAgentSales subclass
class EstateAgentSales extends EstateAgent {
    public EstateAgentSales(String agentName, double propertySaleAmount) {
        super(agentName, propertySaleAmount);
    }

    public void printPropertyReport() {
        System.out.println("Estate Agent: " + getAgentName());
        System.out.println("Property Sale Price: R " + getPropertyPrice());
        System.out.println("Estate Agent Commission: R " + getAgentCommission());
    }
}

// the PropertyApplication class
public class PropertyAppliciation {
    public static void main(String[] args) {
        // Instantiate the EstateAgentSales class with sample values
        EstateAgentSales agent1 = new EstateAgentSales("John Doe", 2500000);
        EstateAgentSales agent2 = new EstateAgentSales("Jane Smith", 1500000);

        // Print property reports for the estate agents
        System.out.println("Property Sale Commission Report");
        System.out.println("--------------------------------");

        agent1.printPropertyReport();
        System.out.println(); 

        agent2.printPropertyReport();
    }
}
