public class PersonBuilder {
    protected String name;
    protected String surname;
    protected int age;
    protected String address;


    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age > 0) {
            this.age = age;
            return this;
        }
        throw new IllegalStateException("Некорректный возраст!");
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        if (name != null && surname != null && age != 0) {
            return new Person(name, surname, age);
        }
        throw new IllegalStateException("Не хватает данных!");
    }

}
