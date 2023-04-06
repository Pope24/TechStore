package com.techstore.model.product;

import com.techstore.model.categories.Categories;

import javax.persistence.*;
import java.util.List;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(columnDefinition = "varchar(255)")
    private String nameProduct;
    @Column(columnDefinition = "text")
    private String image;
    @Column(columnDefinition = "double")
    private Double price;
    @Column(columnDefinition = "varchar(255)")
    private String screenTechnology;
    @Column(columnDefinition = "varchar(255)")
    private String operatingSystem;
    @Column(columnDefinition = "varchar(255)")
    private String chip;
    @Column(columnDefinition = "double")
    private Double cpu_speed;
    @Column(columnDefinition = "int")
    private Integer ram;
    @Column(columnDefinition = "int")
    private Integer capacity;
    @Column(columnDefinition = "int")
    private Integer pin;
    @Column(columnDefinition = "varchar(255)")
    private String material;
    @Column(columnDefinition = "double")
    private Double weight;
    @Column(columnDefinition = "double")
    private Double size;
    @Column(columnDefinition = "mediumtext")
    private String description;
    @Column(columnDefinition = "date")
    private String timePublic;
    @ManyToOne(targetEntity = Manufacturer.class)
    private Manufacturer manufacturer;
    @ManyToMany
    private List<Utilities> utilities;
    @ManyToOne(targetEntity = Categories.class)
    private Categories categories;

    public Product() {
    }

    public Product(int id, String nameProduct, String image, Double price, String screenTechnology, String operatingSystem, String chip, Double cpu_speed, Integer ram, Integer capacity, Integer pin, String material, Double weight, Double size, String description, String timePublic, Manufacturer manufacturer, List<Utilities> utilities, Categories categories) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.image = image;
        this.price = price;
        this.screenTechnology = screenTechnology;
        this.operatingSystem = operatingSystem;
        this.chip = chip;
        this.cpu_speed = cpu_speed;
        this.ram = ram;
        this.capacity = capacity;
        this.pin = pin;
        this.material = material;
        this.weight = weight;
        this.size = size;
        this.description = description;
        this.timePublic = timePublic;
        this.manufacturer = manufacturer;
        this.utilities = utilities;
        this.categories = categories;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public Categories getCategories() {
        return categories;
    }

    public void setCategories(Categories categories) {
        this.categories = categories;
    }

    public String getScreenTechnology() {
        return screenTechnology;
    }

    public void setScreenTechnology(String screenTechnology) {
        this.screenTechnology = screenTechnology;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getChip() {
        return chip;
    }

    public void setChip(String chip) {
        this.chip = chip;
    }

    public Double getCpu_speed() {
        return cpu_speed;
    }

    public void setCpu_speed(Double cpu_speed) {
        this.cpu_speed = cpu_speed;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Integer getPin() {
        return pin;
    }

    public void setPin(Integer pin) {
        this.pin = pin;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTimePublic() {
        return timePublic;
    }

    public void setTimePublic(String timePublic) {
        this.timePublic = timePublic;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public List<Utilities> getUtilities() {
        return utilities;
    }

    public void setUtilities(List<Utilities> utilities) {
        this.utilities = utilities;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
