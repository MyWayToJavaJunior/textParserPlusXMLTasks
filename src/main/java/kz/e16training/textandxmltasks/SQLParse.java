package kz.e16training.textandxmltasks;


/**
 * Parse of SQL file.
 *
 */
public class SQLParse {
    private User user;
    private String fileName;
    private String userNameFieldName;
    private String userHashFieldName;
    private String userMailFieldName;

    public SQLParse(String fileName, String userNameFieldName, String userHashFieldName, String userMailFieldName) {
        this.fileName = fileName;
        this.userNameFieldName = userNameFieldName;
        this.userHashFieldName = userHashFieldName;
        this.userMailFieldName = userMailFieldName;
        this.user = new User();
    }

    public void parsing() {
        String userBlock = getUserBlock();
        System.out.println(userBlock);
    }

    private String getUserBlock() {
        return null;
    }
}
