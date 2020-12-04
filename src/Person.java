public class Person {
        private String fio;
        private String post;
        private String email;
        private int tel;
        private int salary;
        private int age;

        public Person(String fio, String post, String email, int tel, int salary, int age) {
            this.fio = fio;
            this.post = post;
            this.email = email;
            this.tel = tel;
            this.salary = salary;
            if(age >= 18) {
                this.age = age;
            } else {
                System.out.println("Сотрудник должен быть старше 18 лет");
            }
        }

        int getAge() {
            return age;
        }

        void getFullInfo() {
            System.out.println(fio + " " + post + " " +  email + " " + tel + " " + salary + " " + age);
        }
    }
