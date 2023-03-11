package org.example;

import org.example.proxies.EmailCommentNotificationProxy;
import org.example.repos.DBCommentRepository;
import org.example.services.CommentService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = {CommentService.class, EmailCommentNotificationProxy.class, DBCommentRepository.class})
public class ProjectConfiguration {
}
