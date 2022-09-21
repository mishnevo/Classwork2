package Shop;

public class Computer {
    private String graphicCard;
    private String CPU;
    private int number;
    private String RAM;
    public Computer(){
        graphicCard = " ";
        CPU = " ";
        RAM = " ";
        number = 0;
    }
    public Computer(String pGraphicCard, String pCPU, String pRAM, int pNumber){
        graphicCard = pGraphicCard;
        CPU = pCPU;
        RAM = pRAM;
        number = pNumber;
    }

    public int getNumber() {
        return number;
    }

    public String getGraphicCard() {
        return graphicCard;
    }

    public String getCPU() {
        return CPU;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setGraphicCard(String graphicCard) {
        this.graphicCard = graphicCard;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public String getRAM() {
        return RAM;

    }

    public void print(){
        System.out.println("GPU: " + this.getGraphicCard() + " CPU: " + this.getCPU() + " RAM: " + this.getRAM() + "\n");
    }
}
