package main.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class CarModel {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;

  @ManyToOne(cascade = CascadeType.ALL)
  private CarMake make;
  private String model;
  private int yearRelease;
  private int weight;
  private int euroClass;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public CarMake getMake() {
    return make;
  }

  public void setMake(CarMake make) {
    this.make = make;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public int getYearRelease() {
    return yearRelease;
  }

  public void setYearRelease(int yearRelease) {
    this.yearRelease = yearRelease;
  }

  public int getWeight() {
    return weight;
  }

  public void setWeight(int weight) {
    this.weight = weight;
  }

  public int getEuroClass() {
    return euroClass;
  }

  public void setEuroClass(int euroClass) {
    this.euroClass = euroClass;
  }
}
