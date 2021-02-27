package vasia.cardetailsshop.controller;

import org.springframework.web.bind.annotation.*;
import vasia.cardetailsshop.entity.Worker;
import vasia.cardetailsshop.service.worker.impls.WorkerService;

import java.util.List;

@RestController
@RequestMapping("/workers")
public class WorkerController {
    WorkerService workerService;
    @GetMapping
    public List<Worker> getAll(@RequestParam(required = false, defaultValue = "1") Integer page,
                               @RequestParam(required = false, defaultValue = "10") Integer size){
        return workerService.getAll();
    }
    @GetMapping("/{id}")
    public Worker getById(@PathVariable Long id){
        return workerService.getById(id);
    }

    @PostMapping
    public Worker create(@RequestBody Worker worker){
        return workerService.create(worker);
    }

    @PutMapping("/{id}")
    public Worker update(@PathVariable Long id, @RequestBody Worker worker){
        return workerService.update(id, worker);
    }

    @DeleteMapping("/{id}")
    public void delete(Long id){
        workerService.delete(id);
    }
}
