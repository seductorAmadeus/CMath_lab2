public enum Functions {
    function1("f(x) = e^((-x)^2) - cos(7*x + PI/2)"),
    function2("f(x) = (e^x)^2"),
    function3("f(x) = 8 + 2*x - x^2");

    private String name;

    Functions(String name) {
        this.name = name;
    }

    public String getFunctionName() {
        return name;
    }
}
