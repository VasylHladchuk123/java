package vasia.cardetailsshop.service.worker.impls;


import org.springframework.beans.factory.annotation.Autowired;
import vasia.cardetailsshop.entity.Worker;
import vasia.cardetailsshop.repository.WorkerRepository;
import vasia.cardetailsshop.service.worker.interfaces.IWorkerService;

import java.util.List;
import java.util.Optional;

public class WorkerService implements IWorkerService {
    @Autowired
    private WorkerRepository workerRepository;
    @Override
    public List<Worker> getAll() {
        return workerRepository.findAll();
    }

    @Override
    public Worker getById(Long id) {
        Optional<Worker> result = workerRepository.findById(id);
        if (result.isPresent()) {
            return result.get();
        } else {
            return null;
        }
    }

    @Override
    public Worker create(Worker worker) {
        return workerRepository.save(worker);
    }

    @Override
    public Worker update(Long id, Worker worker) {
        return workerRepository.save(worker);
    }

    @Override
    public void delete(Long id) {
        workerRepository.deleteById(id);
    }
}
