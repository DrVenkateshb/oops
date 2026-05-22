// Generic class
class Box<T> {
    private T data;

    
    // Method to set data
    public void setData(T data) {
        this.data = data;
    }

    // Method to get data
    public T getData() {
        return data;
    }

    // Method to display data type
    public void showType() {
        System.out.println("Type of data stored: " + data.getClass().getName());
    }
}

// Main class
public class GenericDemo {
    public static void main(String[] args) {

        // Integer type object
        Box<Integer> intBox = new Box<>();
        intBox.setData(100);
        System.out.println("Integer Value: " + intBox.getData());
        intBox.showType();

        System.out.println("------------------");

        // String type object
        Box<String> strBox = new Box<>();
        strBox.setData("Hello Generics");
        System.out.println("String Value: " + strBox.getData());
        strBox.showType();

        System.out.println("------------------");

        // Double type object
        Box<Double> dblBox = new Box<>();
        dblBox.setData(25.5);
        System.out.println("Double Value: " + dblBox.getData());
        dblBox.showType();
    }
}