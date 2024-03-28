package Arithmetic;

public class Arithmetic<T1, T2> {
    private T1 t1;
    private T2 t2;

    public Arithmetic(T1 t1, T2 t2) {
        if (!check(t1,t2)) {
            throw new IllegalArgumentException("Argument is not of number type");
        }
        this.t1 = t1;
        this.t2 = t2;
    }

    public <T> T add() {
        double result = ((Number) t1).doubleValue() + ((Number) t2).doubleValue();
        return convert(result);
    }

    public <T> T subtract() {
        double result = ((Number) t1).doubleValue() - ((Number) t2).doubleValue();
        return convert(result);
    }

    public <T> T multiply() {
        double result = ((Number) t1).doubleValue() * ((Number) t2).doubleValue();
        return convert(result);
    }

    public <T> T divide() {
        if (((Number) t2).doubleValue() == 0) {
            throw new ArithmeticException("Division by zero");
        }
        double result = ((Number) t1).doubleValue() / ((Number) t2).doubleValue();
        return convert(result);
    }

    public <T> T getMin() {
        double min = Math.min(((Number) t1).doubleValue(), ((Number) t2).doubleValue());
        return convert(min);
    }

    public <T> T getMax() {
        double max = Math.max(((Number) t1).doubleValue(), ((Number) t2).doubleValue());
        return convert(max);
    }

    private <T> T convert(double value) {
        if (t1 instanceof Double || t2 instanceof Double) {
            return (T) Double.valueOf(value);
        }else if (t1 instanceof Float || t2 instanceof Float) {
            return (T) Float.valueOf((float) value);
        }else if (t1 instanceof  Long || t2 instanceof Long) {
            return (T) Long.valueOf((long) value);
        }else if (t1 instanceof Integer || t2 instanceof Integer) {
            return (T) Integer.valueOf((int) value);
        }else if (t1  instanceof Short || t2 instanceof Short) {
            return (T) Short.valueOf((short) value);
        }
        return null;
    }

    private boolean check(T1 t1, T2 t2) {
        return t1 instanceof Number && t2 instanceof Number;
    }

}
