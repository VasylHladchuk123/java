package vasia.cardetailsshop.service.supplier.impls;

import org.springframework.beans.factory.annotation.Autowired;
import vasia.cardetailsshop.entity.Supplier;
import vasia.cardetailsshop.repository.SupplierRepository;
import vasia.cardetailsshop.service.supplier.interfaces.ISupplierService;

import java.util.List;
import java.util.Optional;

public class SupplierService implements ISupplierService {
    @Autowired
    private SupplierRepository supplierRepository;
    @Override
    public List<Supplier> getAll() {
        return supplierRepository.findAll();
    }

    @Override
    public Supplier getById(Long id) {
        Optional<Supplier> result = supplierRepository.findById(id);
        if (result.isPresent()) {
            return result.get();
        } else {
            return null;
        }
    }

    @Override
    public Supplier create(Supplier supplier) {
        return supplierRepository.save(supplier);
    }

    @Override
    public Supplier update(Long id, Supplier supplier) {
        return supplierRepository.save(supplier);
    }

    @Override
    public void delete(Long id) {
        supplierRepository.deleteById(id);
    }
}
