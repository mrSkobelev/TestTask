package main.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CarMake {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
  private String make;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getMake() {
    return make;
  }

  public void setMake(String make) {
    this.make = make;
  }
}
