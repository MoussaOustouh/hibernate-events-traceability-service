package mo.spring.hibernateeventstraceabilityservice.entities;

import mo.spring.hibernateeventstraceabilityservice.mo_traceability.entities_listeners.implementations.MemberEntityListner;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "members")
//@AttributeOverrides({
//        @AttributeOverride(name = "ipAddress", column = @Column(name="ip_address")),
//        @AttributeOverride(name = "subAction", column = @Column(name = "sub_action", nullable = true))
//})
@EntityListeners(MemberEntityListner.class)
public class Member extends Trace implements Serializable {

    private Long id;
    private String firstName;
    private String lastName;
    private String emailId;
    private Set<Address> addresses;

    @Column(name = "id_member")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "first_name", nullable = false)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(name = "last_name", nullable = false)
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Column(name = "email_address", nullable = false)
    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    @OneToMany(mappedBy = "member", cascade = CascadeType.REMOVE)
    public Set<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(Set<Address> addresses) {
        this.addresses = addresses;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", emailId='" + emailId + '\'' +
                ", " + super.toString()+
                "} ";
    }
}
