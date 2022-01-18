package mo.spring.hibernateeventstraceabilityservice.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import mo.spring.hibernateeventstraceabilityservice.mo_traceability.entities_listeners.implementations.AddressEntityListner;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "addresses")
//@AttributeOverrides({
//        @AttributeOverride(name = "ipAddress", column = @Column(name="ip_address")),
//        @AttributeOverride(name = "subAction", column = @Column(name = "sub_action", nullable = true))
//})
@EntityListeners(AddressEntityListner.class)
public class Address extends Trace implements Serializable {

    private Long id;
    private String street1;
    private String street2;
    private String city;
    private String state;
    private String zip;

    @JsonIgnore
    private Member member;

    @Column(name = "id_address")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "street1", nullable = false)
    public String getStreet1() {
        return street1;
    }

    public void setStreet1(String street1) {
        this.street1 = street1;
    }

    @Column(name = "street2", nullable = false)
    public String getStreet2() {
        return street2;
    }

    public void setStreet2(String street2) {
        this.street2 = street2;
    }

    @Column(name = "city", nullable = false)
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Column(name = "state", nullable = false)
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Column(name = "zip", nullable = false)
    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    @ManyToOne
    @JoinColumn(name = "member_id")
    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", street1='" + street1 + '\'' +
                ", street2='" + street2 + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip='" + zip + '\'' +
                ", " + super.toString()+
                "} ";
    }
}
