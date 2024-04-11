public class Mathematician {

    String name;

    public Mathematician(String name) {
        this.name = name;
    }

    ICalculator operation;

    public void setOperation(ICalculator operation) {
        this.operation = operation;
    }

    public int doOperation(int x, int y) {
        System.out.println(name + " чешет в затылке");
        if (operation != null) {
            System.out.println(name + " я могу делать только " + operation);
            return operation.calculate(x, y);
        }
        else{
            System.out.println("ничего я делать не умею");
            return 0;
        }
    }
}