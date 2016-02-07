package hometask.seven.association.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by horsey on 25.01.16.
 */
public class DriverLicense {
    public enum Category { A,B,C,D,E};
    private List<Category> categories = new ArrayList<Category>();
    private Date fromDate;
    private Date expires;

    public DriverLicense (){
    }

    public DriverLicense(Category category, Date fromDate, Date expires) {
        this.categories.add(  category );
        this.fromDate = fromDate;
        this.expires = expires;
    }

    public DriverLicense(List<Category> categories, Date fromDate, Date expires) {
        this.categories = categories;
        this.fromDate = fromDate;
        this.expires = expires;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getExpires() {
        return expires;
    }


    public void setExpires(Date expires) {
        this.expires = expires;
    }

    @Override
    public String toString() {
        return "DriverLicense{" +
                "categories=" + categories +
                ", fromDate=" + fromDate +
                ", expires=" + expires +
                '}';
    }
}
