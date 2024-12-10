import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class CarRentalManagement extends JFrame {
    private JTable table;
    private DefaultTableModel model;
    private ArrayList<Car> cars;
    private JTextField idField, typeField, rentField, seatsField;
    private JComboBox<String> sortOptions;
    
    public CarRentalManagement() {
        cars = new ArrayList<>();
        loadData();
        
        setTitle("Car Rental Management");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel idLabel = new JLabel("Car ID:");
        idLabel.setBounds(10, 10, 100, 20);
        add(idLabel);

        idField = new JTextField();
        idField.setBounds(120, 10, 100, 20);
        add(idField);

        JLabel typeLabel = new JLabel("Car Type:");
        typeLabel.setBounds(10, 40, 100, 20);
        add(typeLabel);

        typeField = new JTextField();
        typeField.setBounds(120, 40, 100, 20);
        add(typeField);

        JLabel rentLabel = new JLabel("Rental Rate:");
        rentLabel.setBounds(10, 70, 100, 20);
        add(rentLabel);

        rentField = new JTextField();
        rentField.setBounds(120, 70, 100, 20);
        add(rentField);

        JLabel seatsLabel = new JLabel("Seats:");
        seatsLabel.setBounds(10, 100, 100, 20);
        add(seatsLabel);

        seatsField = new JTextField();
        seatsField.setBounds(120, 100, 100, 20);
        add(seatsField);

        JButton addButton = new JButton("Add");
        addButton.setBounds(10, 130, 100, 20);
        addButton.addActionListener(e -> addCar());
        add(addButton);

        JButton deleteButton = new JButton("Delete");
        deleteButton.setBounds(120, 130, 100, 20);
        deleteButton.addActionListener(e -> deleteCar());
        add(deleteButton);

        JButton updateButton = new JButton("Update");
        updateButton.setBounds(10, 160, 100, 20);
        updateButton.addActionListener(e -> updateCar());
        add(updateButton);

        JButton saveButton = new JButton("Save to File");
        saveButton.setBounds(120, 160, 100, 20);
        saveButton.addActionListener(e -> saveData());
        add(saveButton);

        sortOptions = new JComboBox<>(new String[]{"Sort by ID", "Sort by Rental Rate"});
        sortOptions.setBounds(10, 190, 150, 20);
        sortOptions.addActionListener(e -> sortCars());
        add(sortOptions);

        model = new DefaultTableModel();
        model.addColumn("Car ID");
        model.addColumn("Car Type");
        model.addColumn("Rental Rate");
        model.addColumn("Seats");

        table = new JTable(model);
        JScrollPane pane = new JScrollPane(table);
        pane.setBounds(250, 10, 320, 300);
        add(pane);

        refreshTable();
        setVisible(true);
    }

    private void addCar() {
        String id = idField.getText();
        String type = typeField.getText();
        double rent = Double.parseDouble(rentField.getText());
        int seats = Integer.parseInt(seatsField.getText());

        cars.add(new Car(id, type, rent, seats));
        refreshTable();
        clearFields();
    }

    private void deleteCar() {
        int selectedRow = table.getSelectedRow();
        if (selectedRow >= 0) {
            cars.remove(selectedRow);
            refreshTable();
        }
    }

    private void updateCar() {
        int selectedRow = table.getSelectedRow();
        if (selectedRow >= 0) {
            Car car = cars.get(selectedRow);
            car.setType(typeField.getText());
            car.setRent(Double.parseDouble(rentField.getText()));
            car.setSeats(Integer.parseInt(seatsField.getText()));
            refreshTable();
        }
    }

    private void saveData() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\OTO.DAT.txt"))) {
            oos.writeObject(cars);
            JOptionPane.showMessageDialog(this, "Data saved successfully.");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    private void loadData() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\OTO.DAT.txt"))) {
            cars = (ArrayList<Car>) ois.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    private void sortCars() {
        String selected = (String) sortOptions.getSelectedItem();
        if ("Sort by ID".equals(selected)) {
            cars.sort(Comparator.comparing(Car::getId));
        } else if ("Sort by Rental Rate".equals(selected)) {
            cars.sort(Comparator.comparing(Car::getRent));
        }
        refreshTable();
    }

    private void refreshTable() {
        model.setRowCount(0);
        for (Car car : cars) {
            model.addRow(new Object[]{car.getId(), car.getType(), car.getRent(), car.getSeats()});
        }
    }

    private void clearFields() {
        idField.setText("");
        typeField.setText("");
        rentField.setText("");
        seatsField.setText("");
    }

    public static void main(String[] args) {
        new CarRentalManagement();
    }
}

class Car implements Serializable {
    private String id;
    private String type;
    private double rent;
    private int seats;

    public Car(String id, String type, double rent, int seats) {
        this.id = id;
        this.type = type;
        this.rent = rent;
        this.seats = seats;
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public double getRent() {
        return rent;
    }

    public int getSeats() {
        return seats;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setRent(double rent) {
        this.rent = rent;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }
}