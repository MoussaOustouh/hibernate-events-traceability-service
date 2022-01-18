package mo.spring.hibernateeventstraceabilityservice.controllers;

import mo.spring.hibernateeventstraceabilityservice.entities.Member;
import mo.spring.hibernateeventstraceabilityservice.exceptions.ResourceNotFoundException;
import mo.spring.hibernateeventstraceabilityservice.repositories.MemberRepository;
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
public class
MemberController {
    private final MemberRepository memberRepository;

    @Autowired
    public MemberController(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @GetMapping("/members")
    public List<Member> getAllMembers() {
        return memberRepository.findAll();
    }


    @GetMapping("/members/{id}")
    public ResponseEntity<Member> getMemberById(@PathVariable(value = "id") Long memberId) throws ResourceNotFoundException {
        Member member = memberRepository.findById(memberId)
                .orElseThrow(() -> new ResourceNotFoundException("Member not found for this id :: " + memberId));
        return ResponseEntity.ok().body(member);
    }

    @PostMapping("/members")
    public Member createMember(@RequestBody Member member) {
        Member mem = memberRepository.save(member);

        return mem;
    }

//    @PutMapping("/members/{id}")
//    public ResponseEntity<Member> updateMember(@PathVariable(value = "id") Long memberId,
//                                               @RequestBody Member memberDetails) throws ResourceNotFoundException {
//        System.out.println("Thread ID of controller: " + Thread.currentThread().getId());
//        Member member = memberRepository.findById(memberId)
//                .orElseThrow(() -> new ResourceNotFoundException("Member not found for this id :: " + memberId));
//
//        for (Address a : memberDetails.getAddresses()) {
//            a.setMember(member);
//            addressRepository.save(a);
//        }
//
//        member.setEmailId(memberDetails.getEmailId());
//        member.setLastName(memberDetails.getLastName());
//        member.setFirstName(memberDetails.getFirstName());
//        final Member updatedMember = memberRepository.save(member);
//
//        return ResponseEntity.ok(updatedMember);
//    }
//
//    @DeleteMapping("/members/{id}")
//    public ResponseEntity<String> removeMember(@PathVariable(value = "id") Long memberId){
//        if(memberRepository.existsById(memberId)){
//            memberRepository.deleteById(memberId);
//            return ResponseEntity.ok("Deleted");
//        }
//        return ResponseEntity.ok("Not exist");
//    }
}
