public enum Functions {
    function1("f(x) = (e^x)^2"),
    function2("f(x) = ((1/2) * sin(x) * e)\10*x"),
    function3("f(x) = 8 + 2*x - x^2");

    private String name;

    Functions(String name) {
        this.name = name;
    }

    public String getFunctionName() {
        return name;
    }
}
