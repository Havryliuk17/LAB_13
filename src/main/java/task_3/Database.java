package task_3;

public class Database extends БазаДаних{
    public String getUserInfo() {
        return отриматиДаніКористувача();
    }

    public String getStaticInfo() {

        return отриматиСтатистичніДані();
    }
}
