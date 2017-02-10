package br.edu.ufcspa.myepi.model;


/**
 * Created by icaromsc on 08/02/2017.
 */

public class Epi {
    private int id;
    private String type;
    private String description;
    private String observation;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }
}
