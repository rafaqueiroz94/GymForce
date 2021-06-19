package com.gym.gymforce.Controller;

import com.gym.gymforce.Entity.NewClientEntity;
import com.gym.gymforce.Repository.NewClientRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@ResponseBody
@RequestMapping (value = "/api")
@Api(value = "API REST GYN FORCE")
@CrossOrigin(origins = "*")
public class StudentsController {

    @Autowired
    NewClientRepository newClientRepository;

    @GetMapping ("/clients")
    @ApiOperation(value = "Returns a list of CLIENTS")
    public List<NewClientEntity> getClientsFixeds() {
        return newClientRepository.findAll();
    }

    @GetMapping ("/client/{id}")
    @ApiOperation(value = "Return ONE CLIENT")
    public NewClientEntity getClientFixed(@PathVariable(value = "id") long id){
        return newClientRepository.findById(id);
    }

    @PostMapping ("/client")
    @ApiOperation(value = "save a new customer")
    public NewClientEntity saveClient (@RequestBody NewClientEntity newClientEntity) {
        return newClientRepository.save(newClientEntity);
    }

    @PutMapping ("/client/{id}")
    @ApiOperation(value = "change a Stats")
    public ResponseEntity<NewClientEntity> changeClient (@PathVariable (value = "id")long id,
                                                        @Validated @RequestBody NewClientEntity newDetailsClient) {
        NewClientEntity newClientEntity = newClientRepository.findById(id);
        newClientEntity.setCpf(newDetailsClient.getCpf());
        newClientEntity.setName(newDetailsClient.getName());
        newClientEntity.setBirthDay(newDetailsClient.getBirthDay());
        newClientEntity.setStats(newDetailsClient.getStats());
        final NewClientEntity changeClient = newClientRepository.save(newClientEntity);
        return ResponseEntity.ok(changeClient);
    }

    @DeleteMapping (path = "/client/{id}")
    @ApiOperation(value = "delete a customer")
    public void deleteClient (@PathVariable (value = "id")long id ) {
        newClientRepository.deleteById(id);
    
    }

}
