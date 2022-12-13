public class People {
    int yearOfBirth;
    String name;
    String town;
    String jobTitle;

    public People(int yearOfBirth, String name, String town, String jobTitle) {
        if (yearOfBirth >= 1900) {
            this.yearOfBirth = yearOfBirth;
        } else {
            System.out.println("*Не верное значение*");
        }
        if (name == null) {
            name = "*Информация не указана*";
        }
        this.name = name;
        this.town = town;
        this.jobTitle = jobTitle;
    }

    @Override
    public String toString() {
        return "Привет! Меня зовут " + name + ", я из города " + town + ", я родился в " + yearOfBirth + " году. Я работаю на должности " + jobTitle + ". Будем знакомы!";
    }
}

