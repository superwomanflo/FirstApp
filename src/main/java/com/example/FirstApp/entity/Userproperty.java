package com.example.FirstApp.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;



    @Entity
    public class Userproperty {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private long id;

        @NotBlank(message = "Name is mandatory")
        private String name;

        @NotBlank(message = "Email is mandatory")
        private String email;

        public Userproperty() {}

        public Userproperty(String name, String email) {
            this.name = name;
            this.email = email;
        }

        public void setId(long id) {
            this.id = id;
        }

        public long getId() {
            return id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getName() {
            return name;
        }

        public String getEmail() {
            return email;
        }

        @Override
        public String toString() {
            return "User{" + "id=" + id + ", name=" + name + ", email=" + email + '}';
        }
    }



