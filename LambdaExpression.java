@FunctionalInterface
public interface LambdaExpression {
        public void name();

    public static void main(String[] args) {
        LambdaExpression lE=()->{
            System.out.println("pawan reddy");
        };
        lE.name();
    }}
