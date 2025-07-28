package com.ubtechinc.Datatype;

public class AbstractDataTypeUser {
    public abstract class User{
        protected String username;
        protected String password;
        protected String firstname;
        protected String lastname;

        public User(String username, String password, String firstname, String lastname) {
            this.username = username;
            this.password = password;
            this.firstname = firstname;
            this.lastname = lastname;
        }

        public String getUsername() {
            return username;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public boolean validatePassword(String password){

            return this.password.equals(password);

        }

        @Override
        public String toString() {
            return firstName + " " + lastName + " (" + username + ")";
        }

    }
}
