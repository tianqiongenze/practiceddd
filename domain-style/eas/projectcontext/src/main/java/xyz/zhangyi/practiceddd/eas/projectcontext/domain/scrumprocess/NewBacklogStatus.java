package xyz.zhangyi.practiceddd.eas.projectcontext.domain.scrumprocess;

public class NewBacklogStatus implements BacklogStatus {
    @Override
    public boolean isClosed() {
        return false;
    }
}
