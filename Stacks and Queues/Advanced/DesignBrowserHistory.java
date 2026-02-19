package Advanced;

import java.util.*;

class HistoryEntry {
    String url;
    long timestamp;
    public HistoryEntry(String url) {
        this.url=url;
        this.timestamp=System.currentTimeMillis();
    }
}

class BrowserHistory {

    private Stack<String> backStack= new Stack<>();
    private Stack<String> forwardStack = new Stack<>();
    private String current;

    private List<HistoryEntry> history = new ArrayList<>();

    public BrowserHistory(String homepage) {
        current = homepage;
        history.add(new HistoryEntry(homepage));
    }

    public void visit(String url) {
        backStack.push(current);
        current=url;
        forwardStack.clear();
        history.add(new HistoryEntry(url));
    }

    public String back(int steps) {
        while (steps> 0 && !backStack.isEmpty()) {
            forwardStack.push(current);
            current = backStack.pop();
            steps--;
        }
        return current;
    }

    public String forward(int steps) {
        while (steps > 0 && !forwardStack.isEmpty()) {
            backStack.push(current);
            current = forwardStack.pop();
            steps--;
        }
        return current;
    }

    public void deleteAllHistory() {
        history.clear();
        System.out.println("all history deleted.");
    }

    public void deleteHistoryByDays(int days) {
        long currentTime = System.currentTimeMillis();
        long threshold = currentTime - (days *24L*60*60*1000);

        history.removeIf(entry -> entry.timestamp < threshold);

        System.out.println("deleted history older than " + days + " days.");
    }

    public void deleteSpecificURL(String url) {
        history.removeIf(entry -> entry.url.equals(url));
        System.out.println("deleted entries of: " + url);
    }

    public void printHistory() {
        System.out.println("- FUll History -");
        for (HistoryEntry entry : history) {
            System.out.println(entry.url + " | " + new Date(entry.timestamp));
        }
        System.out.println("------------------------");
    }
}

public class DesignBrowserHistory {
    public static void main(String[] args) throws InterruptedException {

        BrowserHistory browser = new BrowserHistory("google.com");
        browser.visit("facebook.com");
        Thread.sleep(1000);
        browser.visit("youtube.com");
        Thread.sleep(1000);
        browser.visit("linkedin.com");
        browser.printHistory();
        browser.deleteSpecificURL("facebook.com");
        browser.printHistory();
        browser.deleteHistoryByDays(0);
        browser.printHistory();
        browser.deleteAllHistory();
        browser.printHistory();
    }
}

/*
Note for me:

 */
