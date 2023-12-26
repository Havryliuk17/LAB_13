package task_1;

mport lombok.SneakyThrows;

public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        try {
            WebDataExtractor extractor = new WebDataExtractor();
            Organization orgInfo = extractor.fetchData("https://github.com/Havryliuk17/LAB_13");
            System.out.println(orgInfo);
        } catch (Exception e) {
            log.error("Error occurred: ", e);
        }
    }
}
