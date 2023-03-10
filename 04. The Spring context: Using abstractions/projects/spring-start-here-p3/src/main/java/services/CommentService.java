package services;

import model.Comment;
import org.springframework.stereotype.Component;
import proxies.CommentNotificationProxy;
import repos.CommentRepository;

@Component
public class CommentService {
    private final CommentRepository commentRepository;
    private final CommentNotificationProxy commentNotificationProxy;

    public CommentService(CommentRepository commentRepository, CommentNotificationProxy commentNotificationProxy){
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;

    }

    public void publishComment(Comment comment) {
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
}
