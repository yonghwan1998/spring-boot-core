package hello.datasource;

import jakarta.annotation.PostConstruct;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.time.Duration;
import java.util.List;

@Slf4j
@Data
public class MyDataSource {

    private String url;
    private String username;
    private String password;
    private int maxConnection;
    private Duration timeout;
    private List<String> options;

    public MyDataSource(String url, String username, String password, int maxConnection, Duration timeout, List<String> options) {
        this.url = url;
        this.username = username;
        this.password = password;
        this.maxConnection = maxConnection;
        this.timeout = timeout;
        this.options = options;
    }

    @PostConstruct
    public void init() {
        log.info("init url={}", url);
        log.info("init username={}", username);
        log.info("init password={}", password);
        log.info("init maxConnection={}", maxConnection);
        log.info("init timeout={}", timeout);
        log.info("init options={}", options);
    }
}
