package vasia.cardetailsshop.service.supplier.interfaces;

import vasia.cardetailsshop.entity.Supplier;

import java.util.List;

public interface ISupplierService {
    List<Supplier> getAll();
    Supplier getById(Long id);
    Supplier create(Supplier supplier);
    Supplier update(Long id, Supplier supplier);
    void delete(Long id);
}
