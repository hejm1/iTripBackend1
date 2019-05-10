package cn.itrip.beans.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * itrip_hotel_feature
 * @author 
 */
public class ItripHotelFeature implements Serializable {
    private Long id;

    private Long hotelid;

    private Long featureid;

    private Date creationdate;

    private Long createdby;

    private Date modifydate;

    private Long modifiedby;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getHotelid() {
        return hotelid;
    }

    public void setHotelid(Long hotelid) {
        this.hotelid = hotelid;
    }

    public Long getFeatureid() {
        return featureid;
    }

    public void setFeatureid(Long featureid) {
        this.featureid = featureid;
    }

    public Date getCreationdate() {
        return creationdate;
    }

    public void setCreationdate(Date creationdate) {
        this.creationdate = creationdate;
    }

    public Long getCreatedby() {
        return createdby;
    }

    public void setCreatedby(Long createdby) {
        this.createdby = createdby;
    }

    public Date getModifydate() {
        return modifydate;
    }

    public void setModifydate(Date modifydate) {
        this.modifydate = modifydate;
    }

    public Long getModifiedby() {
        return modifiedby;
    }

    public void setModifiedby(Long modifiedby) {
        this.modifiedby = modifiedby;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        ItripHotelFeature other = (ItripHotelFeature) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getHotelid() == null ? other.getHotelid() == null : this.getHotelid().equals(other.getHotelid()))
            && (this.getFeatureid() == null ? other.getFeatureid() == null : this.getFeatureid().equals(other.getFeatureid()))
            && (this.getCreationdate() == null ? other.getCreationdate() == null : this.getCreationdate().equals(other.getCreationdate()))
            && (this.getCreatedby() == null ? other.getCreatedby() == null : this.getCreatedby().equals(other.getCreatedby()))
            && (this.getModifydate() == null ? other.getModifydate() == null : this.getModifydate().equals(other.getModifydate()))
            && (this.getModifiedby() == null ? other.getModifiedby() == null : this.getModifiedby().equals(other.getModifiedby()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getHotelid() == null) ? 0 : getHotelid().hashCode());
        result = prime * result + ((getFeatureid() == null) ? 0 : getFeatureid().hashCode());
        result = prime * result + ((getCreationdate() == null) ? 0 : getCreationdate().hashCode());
        result = prime * result + ((getCreatedby() == null) ? 0 : getCreatedby().hashCode());
        result = prime * result + ((getModifydate() == null) ? 0 : getModifydate().hashCode());
        result = prime * result + ((getModifiedby() == null) ? 0 : getModifiedby().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", hotelid=").append(hotelid);
        sb.append(", featureid=").append(featureid);
        sb.append(", creationdate=").append(creationdate);
        sb.append(", createdby=").append(createdby);
        sb.append(", modifydate=").append(modifydate);
        sb.append(", modifiedby=").append(modifiedby);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}