import java.util.*;

class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", age=" + age + "]";
    }
}

public class CollectionOperations{
    public static void main(String[] args) {
        // Collection of String colors
        List<String> colorCollection = new ArrayList<>();

        // Add colors to the collection
        colorCollection.add("Red");
        colorCollection.add("Blue");
        colorCollection.add("Green");
        colorCollection.add("Yellow");

        // Print the collection using toString()
        System.out.println("Color Collection: " + colorCollection);

        // Apply insert and retrieve operations with user-provided colors
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a color to insert: ");
        String colorToInsert = scanner.nextLine();
        colorCollection.add(2, colorToInsert);

        System.out.print("Enter an index to retrieve color: ");
        int indexToRetrieve = scanner.nextInt();
        if (indexToRetrieve >= 0 && indexToRetrieve < colorCollection.size()) {
            String retrievedColor = colorCollection.get(indexToRetrieve);
            System.out.println("Retrieved color: " + retrievedColor);
        } else {
            System.out.println("Invalid index!");
        }

        scanner.nextLine(); // Consume the remaining newline character

        // Update and remove color at a specific index position
        System.out.print("Enter an index to update color: ");
        int indexToUpdate = scanner.nextInt();
        scanner.nextLine(); // Consume the remaining newline character
        if (indexToUpdate >= 0 && indexToUpdate < colorCollection.size()) {
            System.out.print("Enter a new color: ");
            String updatedColor = scanner.nextLine();
            colorCollection.set(indexToUpdate, updatedColor);
            System.out.println("Color at index " + indexToUpdate + " updated!");
        } else {
            System.out.println("Invalid index!");
        }

        System.out.print("Enter an index to remove color: ");
        int indexToRemove = scanner.nextInt();
        if (indexToRemove >= 0 && indexToRemove < colorCollection.size()) {
            colorCollection.remove(indexToRemove);
            System.out.println("Color at index " + indexToRemove + " removed!");
        } else {
            System.out.println("Invalid index!");
        }

        // Apply search operation on Color Collection
        System.out.print("Enter a color to search: ");
        String colorToSearch = scanner.next();
        boolean colorExists = colorCollection.contains(colorToSearch);
        if (colorExists) {
            System.out.println(colorToSearch + " found in the collection!");
        } else {
            System.out.println(colorToSearch + " not found in the collection!");
        }

        // Display collection in both directions before and after sorting
        System.out.println("Before sorting: " + colorCollection);
        Collections.sort(colorCollection);
        System.out.println("After sorting: " + colorCollection);

        // Slice and extract a portion of Collection
        System.out.print("Enter start index for slicing: ");
        int startIndex = scanner.nextInt();
        System.out.print("Enter end index for slicing: ");
        int endIndex = scanner.nextInt();
        List<String> slicedColors = colorCollection.subList(startIndex, endIndex);
        System.out.println("Sliced Colors: " + slicedColors);

        // Collection of Employee objects
        List<Employee> employeeCollection = new ArrayList<>();

        // Add employees to the collection
        employeeCollection.add(new Employee("John", 25));
        employeeCollection.add(new Employee("Alice", 30));
        employeeCollection.add(new Employee("Bob", 28));

        // Print the collection using toString()
        System.out.println("\nEmployee Collection: " + employeeCollection);

        // Apply insert and retrieve operations with user-provided employee
        System.out.print("Enter an employee name to insert: ");
        String employeeName = scanner.next();
        System.out.print("Enter an employee age to insert: ");
        int employeeAge = scanner.nextInt();
        employeeCollection.add(1, new Employee(employeeName, employeeAge));

        System.out.print("Enter an index to retrieve employee: ");
        int employeeIndex = scanner.nextInt();
        if (employeeIndex >= 0 && employeeIndex < employeeCollection.size()) {
            Employee retrievedEmployee = employeeCollection.get(employeeIndex);
            System.out.println("Retrieved employee: " + retrievedEmployee);
        } else {
            System.out.println("Invalid index!");
        }

        scanner.close();
    }
}