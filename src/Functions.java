public enum Functions {
    function1("f(x) = "),
    function2("f(x) = "),
    function3("f(x) = ");

    private String name;

    Functions(String name) {
        this.name = name;
    }

    public String getFunctionName() {
        return name;
    }
}
