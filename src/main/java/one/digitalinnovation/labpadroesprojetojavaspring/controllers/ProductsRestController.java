package one.digitalinnovation.labpadroesprojetojavaspring.controllers;

import one.digitalinnovation.labpadroesprojetojavaspring.entities.Products;
import one.digitalinnovation.labpadroesprojetojavaspring.services.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Esse {@link RestController} representa nossa <b>Facade</b>, pois abstrai toda
 * a complexidade de integrações (Banco de Dados H2 e API do ViaCEP) em uma
 * interface simples e coesa (API REST).
 *
 * @author didifive
 */
@RestController
@RequestMapping("api/v1/products")
public class ProductsRestController {

    @Autowired
    private ProductsService productsService;

    @GetMapping
    public ResponseEntity<Iterable<Products>> findAll() {
        return ResponseEntity.ok(productsService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Products> findById(@PathVariable Long id) {
        return ResponseEntity.ok(productsService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Products> insert(@RequestBody Products product) {
        productsService.insert(product);
        return ResponseEntity.ok(product);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Products> update(@PathVariable Long id, @RequestBody Products product) {
        productsService.update(id, product);
        return ResponseEntity.ok(product);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        productsService.delete(id);
        return ResponseEntity.ok().build();
    }
}