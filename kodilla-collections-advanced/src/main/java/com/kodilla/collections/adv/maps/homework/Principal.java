package com.kodilla.collections.adv.maps.homework;

import java.util.Objects;

public class Principal {
    private String namePrincipal;
    private String nameSchool;

    public Principal(String namePrincipal, String nameSchool) {
        this.namePrincipal = namePrincipal;
        this.nameSchool = nameSchool;
    }

    public String getNamePrincipal() {
        return namePrincipal;
    }

    public String getNameSchool() {
        return nameSchool;
    }

    @Override
    public String toString() {
        return "Principal{" +
                "namePrincipal='" + namePrincipal + '\'' +
                ", nameSchool='" + nameSchool + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Principal principal = (Principal) o;
        return Objects.equals(namePrincipal, principal.namePrincipal) && Objects.equals(nameSchool, principal.nameSchool);
    }

    @Override
    public int hashCode() {
        return Objects.hash(namePrincipal, nameSchool);
    }
}
