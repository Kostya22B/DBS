//package dbs.entities;
//
//import jakarta.persistence.Basic;
//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.Table;
//
//@Entity
//@Table(name = "count_of_assistants_per_hospital", schema = "public", catalog = "bondakos")
//public class CountOfAssistantsPerHospitalEntity {
//    @Basic
//    @Column(name = "hospital_id")
//    private Integer hospitalId;
//    @Basic
//    @Column(name = "name")
//    private String name;
//    @Basic
//    @Column(name = "web_site")
//    private String webSite;
//    @Basic
//    @Column(name = "adress_id")
//    private Integer adressId;
//    @Basic
//    @Column(name = "count_of_assistants")
//    private Long countOfAssistants;
//
//    public Integer getHospitalId() {
//        return hospitalId;
//    }
//
//    public void setHospitalId(Integer hospitalId) {
//        this.hospitalId = hospitalId;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getWebSite() {
//        return webSite;
//    }
//
//    public void setWebSite(String webSite) {
//        this.webSite = webSite;
//    }
//
//    public Integer getAdressId() {
//        return adressId;
//    }
//
//    public void setAdressId(Integer adressId) {
//        this.adressId = adressId;
//    }
//
//    public Long getCountOfAssistants() {
//        return countOfAssistants;
//    }
//
//    public void setCountOfAssistants(Long countOfAssistants) {
//        this.countOfAssistants = countOfAssistants;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        CountOfAssistantsPerHospitalEntity that = (CountOfAssistantsPerHospitalEntity) o;
//
//        if (hospitalId != null ? !hospitalId.equals(that.hospitalId) : that.hospitalId != null) return false;
//        if (name != null ? !name.equals(that.name) : that.name != null) return false;
//        if (webSite != null ? !webSite.equals(that.webSite) : that.webSite != null) return false;
//        if (adressId != null ? !adressId.equals(that.adressId) : that.adressId != null) return false;
//        if (countOfAssistants != null ? !countOfAssistants.equals(that.countOfAssistants) : that.countOfAssistants != null)
//            return false;
//
//        return true;
//    }
//
//    @Override
//    public int hashCode() {
//        int result = hospitalId != null ? hospitalId.hashCode() : 0;
//        result = 31 * result + (name != null ? name.hashCode() : 0);
//        result = 31 * result + (webSite != null ? webSite.hashCode() : 0);
//        result = 31 * result + (adressId != null ? adressId.hashCode() : 0);
//        result = 31 * result + (countOfAssistants != null ? countOfAssistants.hashCode() : 0);
//        return result;
//    }
//}
