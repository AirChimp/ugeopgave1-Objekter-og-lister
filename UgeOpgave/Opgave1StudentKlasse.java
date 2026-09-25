public class Opgave1StudentKlasse {

    // OPG 1
    /*
    public static class Student {
        String name;
        int age;
        String studentId;

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Student(String name, int age, String studentId) {
            this.name = name;
            this.age = age;
            this.studentId = studentId;
        }

        public void printInfo() {
            System.out.println(name + " er " + age + " år");
            if (studentId != null) {
                System.out.println("  ID: " + studentId);
            }
        }
    }

    // Main.java
    public static class Main {

        public static Student findOldest(Student[] students) {
            Student oldest = students[0];
            for (Student s : students) {
                if (s.age > oldest.age) {
                    oldest = s;
                }
            }
            return oldest;
        }

        public static Student findById(Student[] students, String id) {
            for (Student s : students) {
                if (s.studentId != null && s.studentId.equals(id)) {
                    return s;
                }
            }
            return null;
        }

        public static void main(String[] args) {
            Student s1 = new Student("Anna", 21);
            Student s2 = new Student("Peter", 19);
            Student s3 = new Student("Maria", 23);

            Student[] students = {s1, s2, s3};

            System.out.println("Alle studerende:");
            for (Student s : students) {
                s.printInfo();
            }

            Student oldest = findOldest(students);
            System.out.println("\nÆldste studerende:");
            oldest.printInfo();
        }
    }
    // Output:
    // Alle Studerende:
    // Anna er 21 år
    // Peter er 19 år
    // Maria er 23 år
    // Ældste Studerende: Maria
     */
}
