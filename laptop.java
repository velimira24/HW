public class laptop {
    public String model;
    public String brand;
    public Integer ram;
    public Integer HDD;
    public String OS;
    public String colour;
    public Integer year;
    public String graphicController;

    public laptop(String model, String brand) {
        this.model = model;
        this.brand = brand;
        System.out.println("Ноутбук марки " + "'" + this.brand + "'" + " Модель " + this.model);
    }

    public String getModel() {
        return this.model;
    }

    public String getBrand() {
        return this.brand;
    }

    public Integer getRam() {
        return this.ram;
    }

    public Integer getHDD() {
        return this.HDD;
    }

    public String getOS() {
        return this.OS;
    }

    public String getColour() {
        return this.colour;
    }

    public Integer getYear() {
        return this.year;
    }

    public String getGraphicController() {
        return this.graphicController;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setRAM(Integer ram) {
        this.ram = ram;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public void setHDD(Integer HDD) {
        this.HDD = HDD;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public void setGraphicController(String graphicController) {
        this.graphicController = graphicController;
    }

    @Override
    public String toString() {
        StringBuilder nb = new StringBuilder();
        nb.append("Ноутбук ");
        nb.append("Brand ");
        nb.append(this.brand);
        nb.append(" ");
        nb.append(this.model);
        nb.append("OS " + this.OS);
        nb.append("HDD " + this.HDD);
        nb.append("RAM " + this.ram);
        nb.append("colour" + this.colour);
        nb.append("year" + this.year);
        return (nb.toString());
    }
}
