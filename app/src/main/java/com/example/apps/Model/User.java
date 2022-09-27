package com.example.apps.Model;

import com.google.gson.annotations.SerializedName;

public class User {
        @SerializedName("username")
        String username;

        @SerializedName("password")
        String password;

        @SerializedName("phrase")
        String phrase;

        @SerializedName("profileId")
        String profileId;

        @SerializedName("picture")
        String picture;

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getPhrase() {
            return phrase;
        }

        public void setPhrase(String phrase) {
            this.phrase = phrase;
        }

        public String getProfileId() {
            return profileId;
        }

        public void setProfileId(String profileId) {
            this.profileId = profileId;
        }

        public String getPicture() {
            return picture;
        }

        public void setPicture(String picture) {
            this.picture = picture;
        }
}

