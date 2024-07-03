package com.obagajesse.EcommercePriceChecker.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Entity
@Table(name = "online_shop")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OnlineShop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,unique = true)
    private String name;

    @Column(nullable = false,unique = true)
    private String website;

    @Column(nullable = false,unique = true)
    private String contactNumber;

    @Column(nullable = false,unique = true)
    private String email;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OnlineShop that = (OnlineShop) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(website, that.website) && Objects.equals(contactNumber, that.contactNumber) && Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, website, contactNumber, email);
    }

    @Override
    public String toString() {
        return "OnlineShop{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", website='" + website + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
