package com.tts;

public class Pet {
        private String name;
        private int age;
        private String location;
        private String type;

        public Pet(){
            name = "default";
            age = 0;
            location = "location";
            type = "type";
        }

        public Pet(String name, int age, String type) {
            this.name = name;
            this.age = age;
            this.type = type;
        }

        public String getName() {
            return name;
        }
        public String getType() {
            return type;
        }

        public int getAge() {
            return age;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setLocation(String location) {
            this.location = location;
        }
        // oops
//            Pet newPet = new Pet ();
//            Pet newPet2 = new Pet();
    }



