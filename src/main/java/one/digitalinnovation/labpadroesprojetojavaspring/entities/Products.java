package one.digitalinnovation.labpadroesprojetojavaspring.entities;

import javax.persistence.*;

@Entity(name = "Products")
public class Products {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long idProduct;
    private String name;
    private String ean;
    private String unity;
    @OneToMany
    private Distributors distributor;

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

    public Distributors getDistributor() {
        return distributor;
    }

    public void setDistributor(Distributors distributor) {
        this.distributor = distributor;
    }
}
