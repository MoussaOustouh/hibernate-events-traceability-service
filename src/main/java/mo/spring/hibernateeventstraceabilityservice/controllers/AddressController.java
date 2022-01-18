package mo.spring.hibernateeventstraceabilityservice.controllers;

import mo.spring.hibernateeventstraceabilityservice.entities.Address;
import mo.spring.hibernateeventstraceabilityservice.exceptions.ResourceNotFoundException;
import mo.spring.hibernateeventstraceabilityservice.repositories.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class AddressController {
    private final AddressRepository addressRepository;

    @Autowired
    public AddressController(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    @GetMapping("/addresses")
    public List<Address> getAllAddresses() {
        return addressRepository.findAll();
    }

    @GetMapping("/addresses/{id}")
    public ResponseEntity<Address> getAddressById(@PathVariable(value = "id") Long addressId) throws ResourceNotFoundException {
        Address address = addressRepository.findById(addressId)
                .orElseThrow(() -> new ResourceNotFoundException("Address not found for this id :: " + addressId));
        return ResponseEntity.ok().body(address);
    }

    @PostMapping("/addresses")
    public Address createAddress(@RequestBody Address address) {
        return addressRepository.save(address);
    }



//    @PutMapping("/addresses/{id}")
//    public ResponseEntity<Address> updateAddress(@PathVariable(value = "id") Long addressId,
//                                                 @RequestBody Address addressDetails) throws ResourceNotFoundException {
//        System.out.println("Thread ID of controller: " + Thread.currentThread().getId());
//        Address address = addressRepository.findById(addressId)
//                .orElseThrow(() -> new ResourceNotFoundException("Address not found for this id :: " + addressId));
//
//        address.setState(addressDetails.getState());
//        address.setStreet1(addressDetails.getStreet1());
//        address.setStreet2(addressDetails.getStreet2());
//        address.setCity(addressDetails.getCity());
//        address.setZip(addressDetails.getZip());
//
//        address = addressRepository.save(address);
//        return ResponseEntity.ok(address);
//    }

//    @DeleteMapping("/addresses/{id}")
//    public ResponseEntity<String> removeAddress(@PathVariable(value = "id") Long addressId){
//        if(addressRepository.existsById(addressId)){
//            addressRepository.deleteById(addressId);
//            return ResponseEntity.ok("Deleted");
//        }
//        return ResponseEntity.ok("Not exist");
//    }
}
