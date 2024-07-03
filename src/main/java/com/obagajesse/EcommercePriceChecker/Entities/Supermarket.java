package com.obagajesse.EcommercePriceChecker.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Entity
@Table(name = "supermarket")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Supermarket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String name;

    @Column(nullable = false)
    private String location;

    @Column(nullable = false,unique = true)
    private String contactNumber;

    @Column(nullable = false,unique = true)
    private String email;

    @Column(nullable = false,unique = true)
    private String websiteUrl;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Supermarket that = (Supermarket) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(location, that.location) && Objects.equals(contactNumber, that.contactNumber) && Objects.equals(email, that.email) && Objects.equals(websiteUrl, that.websiteUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, location, contactNumber, email, websiteUrl);
    }

    @Override
    public String toString() {
        return "Supermarket{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", email='" + email + '\'' +
                ", websiteUrl='" + websiteUrl + '\'' +
                '}';
    }
}
