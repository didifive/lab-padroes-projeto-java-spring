package one.digitalinnovation.labpadroesprojetojavaspring.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "Products")
public class Products {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long idProduct;
    private String name;
    private String ean;
    private String unity;
    @OneToMany(cascade={CascadeType.MERGE}, fetch = FetchType.LAZY)
    List<Distributors> distributors = new ArrayList<>();

    public Long getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Long idProduct) {
        this.idProduct = idProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEan() {
        return ean;
    }

    public void setEan(String ean) {
        this.ean = ean;
    }

    public String getUnity() {
        return unity;
    }

    public void setUnity(String unity) {
        this.unity = unity;
    }

    public List<Distributors> getDistributors() { return distributors; }

    public void setDistributors(List<Distributors> distributors) {
        this.distributors = distributors;
    }
}
