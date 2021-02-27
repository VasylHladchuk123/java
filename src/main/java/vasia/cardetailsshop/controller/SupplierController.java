package vasia.cardetailsshop.controller;

import org.springframework.web.bind.annotation.*;
import vasia.cardetailsshop.entity.Supplier;
import vasia.cardetailsshop.service.supplier.impls.SupplierService;

import java.util.List;

@RestController
@RequestMapping("/suppliers")
public class SupplierController {
    SupplierService supplierService;
    @GetMapping
    public List<Supplier> getAll(@RequestParam(required = false, defaultValue = "1") Integer page,
                                 @RequestParam(required = false, defaultValue = "10") Integer size){
        return supplierService.getAll();
    }
    @GetMapping("/{id}")
    public Supplier getById(@PathVariable Long id){
        return supplierService.getById(id);
    }

    @PostMapping
    public Supplier create(@RequestBody Supplier supplier){
        return supplierService.create(supplier);
    }

    @PutMapping("/{id}")
    public Supplier update(@PathVariable Long id, @RequestBody Supplier supplier){
        return supplierService.update(id, supplier);
    }

    @DeleteMapping("/{id}")
    public void delete(Long id){
        supplierService.delete(id);
    }

    @GetMapping("/{supplierId}/products")
    public List<Supplier> getProductsBySupplier(@PathVariable Long supplierId){
        return null;
    }
}
