package proxies;

import model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
