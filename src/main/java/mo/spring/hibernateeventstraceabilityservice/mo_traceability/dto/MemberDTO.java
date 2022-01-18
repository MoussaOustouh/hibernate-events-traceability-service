package mo.spring.hibernateeventstraceabilityservice.mo_traceability.dto;

import mo.spring.hibernateeventstraceabilityservice.entities.Member;

public class MemberDTO extends Member {
    private String action;
    private String ip;
    private Long userId;

    public MemberDTO() {
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "MemberDTO{" +
                "action='" + action + '\'' +
                ", ip='" + ip + '\'' +
                ", userId=" + userId +
                ", " + super.toString()+
                "} ";
    }
}
