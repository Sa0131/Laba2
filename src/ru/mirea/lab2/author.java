package ru.mirea.lab2;

public class author {
        private String name, email;
        private char gender;
        public author (String name, String email, char gender)
        {
            this.email= email;
            this. name = name;
            this.gender= gender;
        }

        public String getName() {
            return name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public char getGender() {
            return gender;
        }

        @Override
        public String toString() {
            return "author{" +
                    "name='" + name + '\'' +
                    ", email='" + email + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }
