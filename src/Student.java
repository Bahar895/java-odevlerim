        public class Student extends Person {
            String school;

            public Student(String name, String school) {
                super(name); // üst sınıfın Constructor'ı
                this.school = school; // kendi sınıfının alanı
            }
            @Override
        public void printInfo() {
            super.printInfo(); // üst sıfın metodunu çağır
            System.out.println("Okul: " + this.school);
        }
    }

