package com.nova.gemfire.springdatagemfire.model;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.gemfire.mapping.Region;

@Region
public class Customer implements Serializable {

	private static final long serialVersionUID = 1L;
	private String emailAddress;
    private String firstname;
    private String lastname;
    
    @Id
    private Long id;

    /**
     * Creates a new {@link com.nova.gemfire.springdatagemfire.model.Customer} from the given parameters.
     * @param id the unique id;
     * @param emailAddress must not be {@literal null} or empty.
     * @param firstname must not be {@literal null} or empty.
     * @param lastname must not be {@literal null} or empty.
     */
    public Customer(Long id, String emailAddress, String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.id = id;
        this.emailAddress = emailAddress;
    }

    protected Customer() {
    }

    /**
     * Returns the firstname of the {@link com.nova.gemfire.springdatagemfire.model.Customer}.
     *
     * @return
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * Sets the firstname of the {@link com.nova.gemfire.springdatagemfire.model.Customer}.
     *
     * @param firstname
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * Returns the lastname of the {@link com.nova.gemfire.springdatagemfire.model.Customer}.
     *
     * @return
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * Sets the lastname of the {@link com.nova.gemfire.springdatagemfire.model.Customer}.
     *
     * @param lastname
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * Returns the {@link EmailAddress} of the {@link com.nova.gemfire.springdatagemfire.model.Customer}.
     *
     * @return
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the emailAddress of the {@link com.nova.gemfire.springdatagemfire.model.Customer}.
     *
     * @param emailAddress
     */
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * Gets the id of the {@link com.nova.gemfire.springdatagemfire.model.Customer}.
     * @return
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the id of the {@link com.nova.gemfire.springdatagemfire.model.Customer}.
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "emailAddress=" + emailAddress +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}