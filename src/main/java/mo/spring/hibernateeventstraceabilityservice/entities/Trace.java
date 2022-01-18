package mo.spring.hibernateeventstraceabilityservice.entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Trace {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_trace", nullable = false)
    private Long idTrace;

    @Column(name = "action", nullable = false)
    private String action;

    @Column(name = "sub_action", nullable = true)
    private String subAction;

    @Column(name = "ip_address", nullable = false)
    private String ipAddress;

    @Column(name = "user_id", nullable = false)
    private Long userId;

    public Long getIdTrace() {
        return idTrace;
    }

    public void setIdTrace(Long idTrace) {
        this.idTrace = idTrace;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getSubAction() {
        return subAction;
    }

    public void setSubAction(String subAction) {
        this.subAction = subAction;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Trace{" +
                "idTrace=" + idTrace +
                ", action='" + action + '\'' +
                ", subAction='" + subAction + '\'' +
                ", ipAddress='" + ipAddress + '\'' +
                ", userId=" + userId +
                '}';
    }
}
