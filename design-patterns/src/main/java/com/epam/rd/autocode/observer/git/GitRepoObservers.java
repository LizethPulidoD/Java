package com.epam.rd.autocode.observer.git;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class GitRepoObservers {
    public static Repository newRepository() {
        return new Repository() {
            private final List<WebHook> webHooks = new ArrayList<>();

            @Override
            public void addWebHook(WebHook webHook) {
                webHooks.add(webHook);
            }

            @Override
            public Commit commit(String branch, String author, String[] changes) {
                Commit commit = new Commit(author, changes);
                WebHook commitWebhook = getWebhook(Event.Type.COMMIT, branch);
                if (commitWebhook != null) {
                    commitWebhook.onEvent(new Event(commitWebhook.type(), branch, List.of(commit)));
                }
                return commit;
            }

            @Override
            public void merge(String sourceBranch, String targetBranch) {
                WebHook mergeWebhook = getWebhook(Event.Type.MERGE, targetBranch);
                if (mergeWebhook!=null) {
                    List<Commit> commits = getWebhook(Event.Type.COMMIT, sourceBranch).caughtEvents().stream()
                            .map(Event::commits).collect(Collectors.toList()).stream().flatMap(Collection::stream)
                            .collect(Collectors.toList());
                    mergeWebhook.onEvent(new Event(mergeWebhook.type(), targetBranch, commits));
                }
            }

            private WebHook getWebhook(Event.Type type, String branch) {
                return webHooks.stream().filter(webHook -> webHook.type().equals(type) && webHook.branch().equals(branch))
                        .findAny().orElse(null);
            }
        };

    }

    public static WebHook mergeToBranchWebHook(String branchName) {
        return new WebHook() {
            private final List<Event> events = new ArrayList<>();

            @Override
            public String branch() {
                return branchName;
            }

            @Override
            public Event.Type type() {
                return Event.Type.MERGE;
            }

            @Override
            public List<Event> caughtEvents() {
                return events;
            }

            @Override
            public void onEvent(Event event) {
                this.events.clear();
                this.events.add(event);
            }
        };
    }

    public static WebHook commitToBranchWebHook(String branchName) {

        return new WebHook() {
            private final List<Event> events = new ArrayList<>();

            @Override
            public String branch() {
                return branchName;
            }

            @Override
            public Event.Type type() {
                return Event.Type.COMMIT;
            }

            @Override
            public List<Event> caughtEvents() {
                return events;
            }

            @Override
            public void onEvent(Event event) {
                events.add(event);
            }
        };
    }


}
