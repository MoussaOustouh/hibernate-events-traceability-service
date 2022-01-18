package mo.spring.hibernateeventstraceabilityservice.mo_traceability.mappers;

import mo.spring.hibernateeventstraceabilityservice.entities.Address;
import mo.spring.hibernateeventstraceabilityservice.entities.Member;
import mo.spring.hibernateeventstraceabilityservice.mo_traceability.dto.AddressDTO;
import mo.spring.hibernateeventstraceabilityservice.mo_traceability.dto.MemberDTO;
import org.springframework.beans.BeanUtils;

public class Mapper {
    public static MemberDTO memberToMemberDTO(Member member){
        MemberDTO memberDTO = new MemberDTO();
        BeanUtils.copyProperties(member, memberDTO);
        return memberDTO;
    }

    public static AddressDTO addressToAddressDTO(Address address){
        AddressDTO addressDTO = new AddressDTO();
        BeanUtils.copyProperties(address, addressDTO);
        return addressDTO;
    }
}
